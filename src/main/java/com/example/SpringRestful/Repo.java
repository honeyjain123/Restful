package com.example.SpringRestful;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends JpaRepository<Developers, Integer>{

	//Repository interface extending JPARepository for performing CRUD operations
}
