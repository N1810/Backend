package com.Backend.Backend.Entity.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Backend.Entity.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, Long> {
	

}
