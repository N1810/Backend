package com.Backend.Backend.Entity;

import java.util.List;
import javax.validation.constraints.NotBlank;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class CategoryData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotBlank String categoryName;
	private @NotBlank String categoryDetails;
	private @NotBlank String imgurl;
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "Cc_fk", referencedColumnName = "id")
	private List<Course> course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CategoryData [id=" + id + ", categoryName=" + categoryName + ", categoryDetails=" + categoryDetails
				+ ", imgurl=" + imgurl + ", course=" + course + "]";
	}

	public CategoryData(Long id, String categoryName, String categoryDetails, String imgurl, List<Course> course) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryDetails = categoryDetails;
		this.imgurl = imgurl;
		this.course = course;
	}

	public CategoryData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
