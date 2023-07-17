package com.Backend.Backend.Service;

import java.io.Reader;
import java.sql.Clob;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Backend.Entity.Course;
import com.Backend.Backend.Entity.Dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseDao coursedao;

	@Override
	public List<Course> getallCourse() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}

	@Override
	public Course Addcourse(Course course) {
		// TODO Auto-generated method stub
//		course.setCourseImg(StringToClob(course.getCourseImg()));
		coursedao.save(course);

		return course;
	}

	public String getFinalResponsetoString(Clob finalResponse) {
		Reader r;
		StringBuffer buffer = new StringBuffer();
		if (finalResponse != null) {
			try {
				r = finalResponse.getCharacterStream();
				int ch = r.read();
				while (ch != -1) {
					buffer.append("" + (char) ch);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		return buffer.toString();
	}
//
//public Clob StringToClob(String str) throws SerialException,SQLException{
//	String data =str.toString();
//	Clob myClob =new javax.sql.rowset.serial.SerialClob(data.toCharArray());
//	return myClob;)
//}

	@Override
	public Course updatecourse(Course course) {
		// TODO Auto-generated method stub
		coursedao.save(course);
		return course;
	}

	@Override
	public void deletecourse(long parseLong) {
		// TODO Auto-generated method stub
		Course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
	}

	@Override
	public Course getCourse(long CourseId) {
		// TODO Auto-generated method stub

		Optional<Course> categoryDataOptional = coursedao.findById(CourseId);
		return categoryDataOptional.orElse(null);
	}
}
