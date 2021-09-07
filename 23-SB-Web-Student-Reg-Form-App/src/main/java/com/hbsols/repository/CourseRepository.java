package com.hbsols.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hbsols.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {

	@Query("SELECT courseName FROM Course")
	public List<String> getCourseName();

}
