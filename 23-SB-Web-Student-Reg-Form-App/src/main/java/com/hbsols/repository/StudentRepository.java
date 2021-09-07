package com.hbsols.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hbsols.model.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Serializable> {

}
