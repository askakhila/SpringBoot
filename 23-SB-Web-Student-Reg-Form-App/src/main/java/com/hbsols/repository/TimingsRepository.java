package com.hbsols.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hbsols.model.Timings;

@Repository
public interface TimingsRepository extends JpaRepository<Timings, Serializable> {

	@Query("SELECT timingName FROM Timings")
	public List<String> getTimingsName();

}
