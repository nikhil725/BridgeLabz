package com.bridgeit.todo.user.service;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.todo.user.dao.IUserDao;
import com.bridgeit.todo.user.model.User;
import com.bridgeit.todo.util.Mail;
import com.bridgeit.todo.util.Validation;


//@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao userDao;

	@Autowired
	BCryptPasswordEncoder encoder;

	@Transactional
	public String addUser(User user, HttpServletRequest req) {
		System.out.println("In side add user service");

		
		String msg = Validation.userValidation(user.getName(), user.getEmail(), user.getPassword());

		if (msg != null) {
			return msg;
		}

		System.out.println("URl... " + req.getRequestURL());
		
		String hashcode = encoder.encode(user.getPassword());
		user.setPassword(hashcode);
		String randomID = UUID.randomUUID().toString();
		user.setRandomId(randomID);
		userDao.addUser(user);
		
		//user.setName("abc");
		
		String url = req.getRequestURL().toString().substring(0, req.getRequestURL().lastIndexOf("/"))
				+ "/activateUser/" + randomID ;

		System.out.println("emailID.." + user.getEmail());
		String mailTo = user.getEmail();
		String message = url;
		String subject = "link to activate your account";

	//	Mail.sendMail(mailTo,message,subject);

		return null;

	}

	@Transactional
	public User validateUser(User user) {
		System.out.println("In validate user");
		return userDao.validateUser(user);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public User getUserByEmaiId(User user) {
		System.out.println("service get user");
		User userInformation = userDao.getUserByEmaiId(user);
		return userInformation;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public User getUserById(int id) {

		User userDetails = userDao.getUserById(id);
		return userDetails;
	}

	@Override
	public boolean forgotPassword(User user, HttpServletRequest req) {
		
			User userInformation = userDao.getUserByEmaiId(user);
			String randomId = userInformation.getRandomId();
		
		if(userInformation!= null) {
			
			String url = req.getRequestURL().toString().substring(0, req.getRequestURL().lastIndexOf("/")) + "/resetPassword/" + randomId;	
			String mailTo = user.getEmail();
			String msg = "click on given link to rest yor password "+url;
			String subject = "reset password link";
			Mail.sendMail(mailTo, msg, subject);
			
		}
		
				return false;
	}

	// Required for UPDATE
	// Supports for READ
	
	@Transactional(propagation=Propagation.REQUIRED)
	public String activateUser(String randomId, HttpServletRequest request) {
		
		User user = userDao.getUserByRandomId(randomId);
		
		System.out.println(user.getName()+"..."+user.getPassword()+"..."+user.getEmail()+"...."+user.getStatus());
		user.setStatus(true);
		User user2 = userDao.updateRecord(user);
		
		System.out.println(user2.getName()+"..."+user2.getPassword()+"..."+user2.getEmail()+"...."+user2.getStatus());
		
		return null;
	}

	@Transactional
	public String resetPassword(HttpServletRequest request, User user, String randomId) {
		
		User user2 = userDao.getUserByRandomId(randomId);
		String newPassword = user.getPassword();
		String hashCodePassword = encoder.encode(newPassword);
		user2.setPassword(hashCodePassword);
		userDao.updateRecord(user2);
		System.out.println("password reset successfully");
				return null;
	}

	@Transactional
	public boolean isEmailIdPresent(String email) {
		
		List<User> userList = userDao.checkEmailId(email);
		if (userList.size() != 0) {
			return true;
		}
		return false;
	}

	

	

}
