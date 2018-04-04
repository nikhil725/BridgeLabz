package com.bridgeit.todo.notes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.todo.notes.dao.INoteDao;
import com.bridgeit.todo.notes.model.Notes;
import com.bridgeit.todo.user.dao.IUserDao;
import com.bridgeit.todo.user.model.User;

public class NoteServiceImpl implements INoteService{

	@Autowired
	INoteDao noteDao;
	
	@Autowired
	IUserDao userDao;
	@Transactional
	public int createNote(Notes notes,User user) {
		
		notes.setUser(user);
		noteDao.addNotes(notes);
		
				return 0;
	}

	@Transactional
	public void updateNote(Notes notes, int id) {
		
		noteDao.updateNote(notes, id);
						
	}

	@Transactional
	public int deleteNote(int id) {			
		noteDao.deleteNote(id);
		return 0;
				
	}

	@Transactional
	public List<Notes> getNotes(String id) {
		
		User user = userDao.getUserById(id);
		return noteDao.getNotes(user);
		
		
		}
				
	}
