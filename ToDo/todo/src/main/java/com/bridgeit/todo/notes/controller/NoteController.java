package com.bridgeit.todo.notes.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeit.todo.notes.model.Notes;
import com.bridgeit.todo.notes.service.INoteService;
import com.bridgeit.todo.user.model.User;

@RestController
public class NoteController {


	@Autowired
	INoteService noteService;

	@RequestMapping(value="createNotes", method = RequestMethod.POST)
	public ResponseEntity<String> creatNotes(@RequestBody Notes notes,HttpServletRequest req){
		
		System.out.println("In side create Notes");
		User user=(User) req.getSession().getAttribute("nameid");
		System.out.println("idddd"+user.getId());
		noteService.createNote(notes,user);
		return new ResponseEntity<String>("Notes saved...",HttpStatus.OK);
	}
	
	@RequestMapping(value="updateNotes/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateNotes(@PathVariable("id") int id, @RequestBody Notes notes){
		
		noteService.updateNote(notes, id);
		System.out.println("id is"+id);
		return new ResponseEntity<String>("Notes updated...",HttpStatus.OK);

	}

	@RequestMapping(value="/deleteNotes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteNotes(@PathVariable("id") int id, @RequestBody Notes notes){

		noteService.deleteNote(id);	
		return new ResponseEntity<String>("Notes deleted...",HttpStatus.OK);

	}
	
	@RequestMapping(value="/getNotes/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Notes>> getNotes(@PathVariable("id") String id, @RequestBody Notes notes){
		try {
			List<Notes> notes2 = noteService.getNotes(id);
			if (notes2.size() != 0) {
				
				return new ResponseEntity<List<Notes>>(notes2,HttpStatus.OK);
				
			} else {
				
				return new ResponseEntity<List<Notes>>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			
			return new ResponseEntity<List<Notes>>(HttpStatus.CONFLICT);
		}
	}

}
