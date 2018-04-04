package com.bridgeit.todo.notes.service;

import java.util.List;

import com.bridgeit.todo.notes.model.Notes;
import com.bridgeit.todo.user.model.User;

public interface INoteService {

	public int createNote(Notes notes,User user);
	public void updateNote(Notes notes, int id);
	public int deleteNote(int id);
	List<Notes> getNotes(String email);
	
}
