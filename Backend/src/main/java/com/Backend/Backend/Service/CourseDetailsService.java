package com.Backend.Backend.Service;

import java.util.List;

import com.Backend.Backend.Entity.CourseDetails;

public interface CourseDetailsService {
	public List<CourseDetails> getallCourseDetails();

	public CourseDetails getCourseDetails(long CourseId);

	public CourseDetails AddCourseDetails(CourseDetails coursedetails);

	public CourseDetails updateCourseDetails(CourseDetails coursedetails);

	public void deleteCourseDetails(long parseLong);
}
