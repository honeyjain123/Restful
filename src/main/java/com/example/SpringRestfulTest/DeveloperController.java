package com.example.SpringRestfulTest;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {

	@Autowired
	Repo repo;
	
	@GetMapping("/developers")
	public List<Developers> getdeveloper()
	{
		return repo.findAll();
	}
	
	@GetMapping("/developers/{id}")
	public Optional<Developers> getdeveloperbyid(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("/developers")
	public String postmethod(Developers developer)
	{
		repo.save(developer);
		return "Developer is created successfully";
	}
	
	@DeleteMapping("/developers/{id}")
	public String deletemethod(@PathVariable("id") int id)
	{
		Developers d= repo.getOne(id);
		repo.delete(d);
		return "Developer is deleted successfully";
	}
	
	@PutMapping(path="/developers", consumes = {"application/json"})
	public String updatemethod(@RequestBody Developers developer)
	{
		repo.save(developer);
		return "Developer is updated successfully";
	}
}
