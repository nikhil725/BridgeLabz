package com.bridgeit.todo.user.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bridgeit.todo.notes.model.Notes;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String randomId;
	
	@Column
	private Boolean status = false;
	
	@OneToMany(mappedBy = "user")
	private Set<Notes> notes;
	
	
	
	public String getRandomId() {
		return randomId;
	}
	public void setRandomId(String randomId) {
		this.randomId = randomId;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Set<Notes> getNotes() {
		return notes;
	}
	public void setNotes(Set<Notes> notes) {
		this.notes = notes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}