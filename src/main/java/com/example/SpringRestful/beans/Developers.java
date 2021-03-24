package com.example.SpringRestful.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel(description = "Developers Table")
public class Developers {
	//Entity Class for creating a table in H2 database
	@Id
	@ApiModelProperty(notes = "ID for unique identification of a developer")
	private int id;
	@ApiModelProperty(notes = "Developer Name")
	private String name;
	@ApiModelProperty(notes = "Developer Skills")
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
