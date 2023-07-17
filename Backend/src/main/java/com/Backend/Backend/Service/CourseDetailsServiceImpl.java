package com.Backend.Backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Backend.Entity.CategoryData;
import com.Backend.Backend.Entity.CourseDetails;
import com.Backend.Backend.Entity.Dao.CourseDetailsDao;

@Service
public class CourseDetailsServiceImpl implements CourseDetailsService {
	@Autowired
	CourseDetailsDao coursedetailsdao;

	@Override
	public List<CourseDetails> getallCourseDetails() {
		// TODO Auto-generated method stub
		return coursedetailsdao.findAll();
	}

	@Override
	public CourseDetails AddCourseDetails(CourseDetails coursedetails) {
		// TODO Auto-generated method stub
		coursedetailsdao.save(coursedetails);
		return coursedetails;
	}

	@Override
	public CourseDetails updateCourseDetails(CourseDetails coursedetails) {
		// TODO Auto-generated method stub
		coursedetailsdao.save(coursedetails);
		return coursedetails;
	}

	@Override
	public void deleteCourseDetails(long parseLong) {
		// TODO Auto-generated method stub
		CourseDetails entity = coursedetailsdao.getOne(parseLong);
		coursedetailsdao.delete(entity);
	}

	@Override
	public CourseDetails getCourseDetails(long CourseDetailId) {
		// TODO Auto-generated method stub

		Optional<CourseDetails> categoryDataOptional = coursedetailsdao.findById(CourseDetailId);
		return categoryDataOptional.orElse(null);
	}

}
