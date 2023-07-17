package com.Backend.Backend.Service;

import java.util.List;

import com.Backend.Backend.Entity.Course;

public interface CourseService {

	public List<Course> getallCourse();

	public Course getCourse(long CourseId);

	public Course Addcourse(Course course);

	public Course updatecourse(Course course);

	public void deletecourse(long parseLong);

}
