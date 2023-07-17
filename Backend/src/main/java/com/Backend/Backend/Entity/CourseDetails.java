package com.Backend.Backend.Entity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CourseDetails")
public class CourseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="CourseDescription")
	private @NotBlank String CourseDescription;
	@Column(name="Certification")
	private @NotBlank String Certification;
	@Column(name="LearningOutCome")
	private @NotBlank String LearningOutCome;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCourseDescription() {
		return CourseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		CourseDescription = courseDescription;
	}
	public String getCertification() {
		return Certification;
	}
	public void setCertification(String certification) {
		Certification = certification;
	}
	public String getLearningOutCome() {
		return LearningOutCome;
	}
	public void setLearningOutCome(String learningOutCome) {
		LearningOutCome = learningOutCome;
	}
	@Override
	public String toString() {
		return "CourseDetails [id=" + id + ", CourseDescription=" + CourseDescription + ", Certification="
				+ Certification + ", LearningOutCome=" + LearningOutCome + "]";
	}
	public CourseDetails(Long id, @NotBlank String courseDescription, @NotBlank String certification,
			@NotBlank String learningOutCome) {
		super();
		this.id = id;
		CourseDescription = courseDescription;
		Certification = certification;
		LearningOutCome = learningOutCome;
	}
	public CourseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
