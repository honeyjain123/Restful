package com.example.SpringRestful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestful.beans.Developers;
import com.example.SpringRestful.repository.Repo;

import io.swagger.annotations.ApiOperation;

@RestController

public class DeveloperController {
//class acting as a controller to execute all requests from repository
	@Autowired
	Repo repo;
	
	@GetMapping("/developers/")
	@ApiOperation(value = "Display All Developers", notes = "It fetches all the developers from H2 database")
	public List<Developers> getdeveloper()
	//method to display all developers from database
	{
		return repo.findAll(); //predefined findAll method from repository
	}
	
	@GetMapping("/developers/{id}")
	@ApiOperation(value = "Display A Developer By its Id", notes = "It fetches the particular developer from H2 database by its Id")
	public Optional<Developers> getdeveloperbyid(@PathVariable("id") int id)
	//method to get a particular developer from its id
	{
		return repo.findById(id); //predefined findById method from repository to get details of a particular developer
	}
	
	@PostMapping("/developers/")
	@ApiOperation(value = "Creates a new Developer", notes = "It creates a new developer and save it in H2 database")
	public String postmethod(Developers developer)
	//method to create a new developer
	{
		repo.save(developer); //predefined save method from repository to save details of a new developer in database
		return "Developer is created successfully";
	}
	
	@DeleteMapping("/developers/{id}")
	@ApiOperation(value = "Deletes a particular Developer", notes = "It deletes a particular developer by its Id")
	public String deletemethod(@PathVariable("id") int id)
	//method to delete an existing developer
	{
		Developers d= repo.getOne(id); //predefined getOne method to get details of that particular developer
		repo.delete(d); //predefined method to delete developer
		return "Developer is deleted successfully";
	}
	
	@PutMapping(path="/developers/", consumes = {"application/json"})
	@ApiOperation(value = "Update a particluar Developer", notes = "It updates a particular developer")
	public String updatemethod(@RequestBody Developers developer)
	//method to update details of a particular developer
	{
		repo.save(developer);
		return "Developer is updated successfully";
	}
}
