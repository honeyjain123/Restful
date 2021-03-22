package com.example.SpringRestful;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developers {
	//Entity Class for creating a table in H2 database
	@Id
	
	private int id;
	private String name;
	private String skills;
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
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Developers [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}
	
	
}
