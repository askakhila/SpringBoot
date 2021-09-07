package com.hbsols.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbsols.binding.Student;
import com.hbsols.model.Genders;
import com.hbsols.model.StudentEntity;
import com.hbsols.repository.CourseRepository;
import com.hbsols.repository.GenderRepository;
import com.hbsols.repository.StudentRepository;
import com.hbsols.repository.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private GenderRepository genderRepo;

	@Autowired
	private TimingsRepository timingsRepo;
	
	@Autowired
	private StudentRepository studentRepo;

	// Using Java 7

	/*
	 * public List<String> getGenders() {
	 * 
	 * List<Genders> listGenders = (List<Genders>) genderRepo.findAll();
	 * 
	 * List<String> gendersList = new ArrayList<>();
	 * 
	 * for (Genders genders : listGenders) {
	 * gendersList.add(genders.getGenderName()); }
	 * 
	 * return gendersList; }
	 */

// Using java 8

	/*
	 * public List<String> getGenders() {
	 * 
	 * List<Genders> listGenders = (List<Genders>) genderRepo.findAll();
	 * 
	 * List<String> genders = listGenders.stream().map(gender ->
	 * gender.getGenderName()).collect(Collectors.toList());
	 * 
	 * return genders; }
	 * 
	 */

// using custom query

	public List<String> getGenders() {

		List<String> genderNamesList = genderRepo.getGendersName();

		return genderNamesList;
	}

	public List<String> getCourses() {

		List<String> courseNamesList = courseRepo.getCourseName();

		return courseNamesList;
	}

	public List<String> getTimings() {

		List<String> timingsList = timingsRepo.getTimingsName();

		return timingsList;
	}
	
	public String  saveStudentInfo(Student student) {
		
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		
		studentRepo.save(entity);
		
		return "Student Details inserted into DB successfully";
	}

	public boolean saveStudent(Student student) {

		StudentEntity entity = new StudentEntity();

		BeanUtils.copyProperties(student, entity);

		StudentEntity saveEntity = studentRepo.save(entity);

		return saveEntity != null && saveEntity.getStId() != null;
	}
}
