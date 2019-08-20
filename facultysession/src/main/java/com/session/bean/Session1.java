package com.session.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Session1 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int duration;
	private String faculty;
	private String session_mode;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSession_mode() {
		return session_mode;
	}
	public void setSession_mode(String mode) {
		this.session_mode = mode;
	}
	@Override
	public String toString() {
		return "Session [id=" + id + ", name=" + name + ", duration=" + duration + ", faculty=" + faculty + ", mode="
				+ session_mode + "]";
	}
		

}
