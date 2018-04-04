package com.bridgeit.todo.notes.dao;

import java.util.List;

import com.bridgeit.todo.notes.model.Notes;
import com.bridgeit.todo.user.model.User;

public interface INoteDao {
	
	public void addNotes(Notes notes);
	public void updateNote(Notes notes,int id);
	public void deleteNote(int id);
	List<Notes> getNotes(User user);
	
}
