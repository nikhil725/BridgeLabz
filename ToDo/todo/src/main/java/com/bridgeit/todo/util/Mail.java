package com.bridgeit.todo.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	
	public static String from = "nik703.v@gmail.com";
	public static String password = "";
    public static Properties props = new Properties();
	public static String sendMail(String mailTo, String msg, String subject) {
		
		 

             props.put("mail.smtp.host", "smtp.gmail.com");
             props.put("mail.smtp.socketFactory.port", "465");
             props.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
             props.put("mail.smtp.auth", "true");
             props.put("mail.smtp.port", "465");
             props.put("mail.smtp.starttls.enable", "true");

             //get Session   
             Session session = Session.getInstance(props,
                     new javax.mail.Authenticator() {
                         protected PasswordAuthentication getPasswordAuthentication() {
                             return new PasswordAuthentication(from, password);
                         }
                     });
            
             try {
                 MimeMessage message = new MimeMessage(session);
                 message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo));
                 message.setSubject(subject);
                 message.setText(msg);
                 //send message  
                 Transport.send(message);
                 System.out.println("message sent successfully");
               
             } catch (Exception e) {
                 System.out.println(e);
             }
         
			return subject;
	        
		
	}

}
