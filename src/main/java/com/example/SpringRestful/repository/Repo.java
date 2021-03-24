package com.example.SpringRestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestful.beans.Developers;


public interface Repo extends JpaRepository<Developers, Integer>{

	//Repository interface extending JPARepository to performing CRUD operations
}
