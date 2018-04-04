package com.bridgeit.todo.notes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bridgeit.todo.user.model.User;

@Entity
@Table(name="Notes")
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noteId;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public String getTitle() {
		return title;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
