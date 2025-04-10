package com.example.prol_educa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prol_educa.entities.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer>{

}
