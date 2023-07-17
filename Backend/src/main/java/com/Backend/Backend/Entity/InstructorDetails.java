package com.Backend.Backend.Entity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InstructorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotBlank String InstructorName;
	private @NotBlank String Profession;
	private @NotBlank String Description;
	private @NotBlank String ImgUrl;

//	@ManyToMany(mappedBy = "instructordetails")
//	private List<Course> course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInstructorName() {
		return InstructorName;
	}

	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}

	public String getProfession() {
		return Profession;
	}

	public void setProfession(String profession) {
		Profession = profession;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}
//
//	public List<Course> getCourse() {
//		return course;
//	}
//
//	public void setCourse(List<Course> course) {
//		this.course = course;
//	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", InstructorName=" + InstructorName + ", Profession=" + Profession
				+ ", Description=" + Description + ", ImgUrl=" + ImgUrl + "]";
	}

	public InstructorDetails(Long id, @NotBlank String instructorName, @NotBlank String profession,
			@NotBlank String description, @NotBlank String imgUrl) {
		super();
		this.id = id;
		InstructorName = instructorName;
		Profession = profession;
		Description = description;
		ImgUrl = imgUrl;
	}

	public InstructorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
