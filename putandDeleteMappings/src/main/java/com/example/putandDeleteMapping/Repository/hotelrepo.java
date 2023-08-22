package com.example.putandDeleteMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.putandDeleteMapping.model.Hotelmodel;

public interface hotelrepo extends JpaRepository<Hotelmodel, Integer>{
	
}