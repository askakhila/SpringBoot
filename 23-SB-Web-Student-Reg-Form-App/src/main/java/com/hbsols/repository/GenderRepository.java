package com.hbsols.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hbsols.model.Genders;

@Repository
public interface GenderRepository extends JpaRepository<Genders, Serializable> {
	
	@Query( "SELECT genderName FROM Genders")
	public List<String> getGendersName();

}
