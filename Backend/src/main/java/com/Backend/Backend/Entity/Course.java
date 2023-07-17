package com.Backend.Backend.Entity;



import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "course_name")
	private @NotBlank String CourseName;
	@Column(name = "course_price")
	private long CoursePrice;
	@Column(name = "course_features")
	private @NotBlank String CourseFeatures;
	@Column(name = "course_img")
	private String CourseImg;
	@Column(name = "course_duration")
	private @NotNull Long courseDuration;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Course_instructor", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "instructor_id"))
	private List<InstructorDetails> instructordetails;
	@OneToMany(targetEntity = Features.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "course_features", referencedColumnName = "id")
	private List<Features> features;
	@OneToMany(targetEntity = CourseDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "course_details", referencedColumnName = "id")
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
	
	public String getCourseImg() {
		return CourseImg;
	}
	public void setCourseImg(String courseImg) {
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
		return "Course [id=" + id + ", CourseName=" + CourseName + ", CoursePrice=" + CoursePrice + ", CourseFeatures="
				+ CourseFeatures + ", CourseImg=" + CourseImg + ", courseDuration=" + courseDuration
				+ ", instructordetails=" + instructordetails + ", features=" + features + ", courseDetails="
				+ courseDetails + "]";
	}
	public Course(Long id, @NotBlank String courseName, long coursePrice, @NotBlank String courseFeatures,
			String courseImg, @NotNull Long courseDuration, List<InstructorDetails> instructordetails,
			List<Features> features, List<CourseDetails> courseDetails) {
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
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
