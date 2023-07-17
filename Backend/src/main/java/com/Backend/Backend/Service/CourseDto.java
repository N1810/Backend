package com.Backend.Backend.Service;

import java.sql.Clob;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.Backend.Backend.Entity.CourseDetails;
import com.Backend.Backend.Entity.Features;
import com.Backend.Backend.Entity.InstructorDetails;

public class CourseDto {

	private Long id;

	private String CourseName;

	private long CoursePrice;

	private String CourseFeatures;

	private Clob CourseImg;

	private Long courseDuration;

	private List<InstructorDetails> instructordetails;

	private List<Features> features;

	private List<CourseDetails> courseDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public long getCoursePrice() {
		return CoursePrice;
	}

	public void setCoursePrice(long coursePrice) {
		CoursePrice = coursePrice;
	}

	public String getCourseFeatures() {
		return CourseFeatures;
	}

	public void setCourseFeatures(String courseFeatures) {
		CourseFeatures = courseFeatures;
	}

	public Clob getCourseImg() {
		return CourseImg;
	}

	public void setCourseImg(Clob courseImg) {
		CourseImg = courseImg;
	}

	public Long getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Long courseDuration) {
		this.courseDuration = courseDuration;
	}

	public List<InstructorDetails> getInstructordetails() {
		return instructordetails;
	}

	public void setInstructordetails(List<InstructorDetails> instructordetails) {
		this.instructordetails = instructordetails;
	}

	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> features) {
		this.features = features;
	}

	public List<CourseDetails> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(List<CourseDetails> courseDetails) {
		this.courseDetails = courseDetails;
	}

	@Override
	public String toString() {
		return "CourseDto [id=" + id + ", CourseName=" + CourseName + ", CoursePrice=" + CoursePrice
				+ ", CourseFeatures=" + CourseFeatures + ", CourseImg=" + CourseImg + ", courseDuration="
				+ courseDuration + ", instructordetails=" + instructordetails + ", features=" + features
				+ ", courseDetails=" + courseDetails + "]";
	}

	public CourseDto(Long id, String courseName, long coursePrice, String courseFeatures, Clob courseImg,
			Long courseDuration, List<InstructorDetails> instructordetails, List<Features> features,
			List<CourseDetails> courseDetails) {
		super();
		this.id = id;
		CourseName = courseName;
		CoursePrice = coursePrice;
		CourseFeatures = courseFeatures;
		CourseImg = courseImg;
		this.courseDuration = courseDuration;
		this.instructordetails = instructordetails;
		this.features = features;
		this.courseDetails = courseDetails;
	}

	public CourseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
