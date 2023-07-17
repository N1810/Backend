package com.Backend.Backend.Entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "features")
public class Features {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "lectures")
	private @NotNull int lectures;
	@Column(name = "quiz")
	private @NotNull int Quiz;
	@Column(name = "duration")
	private @NotNull double Duration;
	@Column(name = "language")
	private @NotBlank String Language;
	@Column(name = "assessment")
	private @NotBlank String Assessment;
//	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	@JoinColumn(name="Course_feature")
//	private Course course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLectures() {
		return lectures;
	}

	public void setLectures(int lectures) {
		this.lectures = lectures;
	}

	public int getQuiz() {
		return Quiz;
	}

	public void setQuiz(int quiz) {
		Quiz = quiz;
	}

	public double getDuration() {
		return Duration;
	}

	public void setDuration(double duration) {
		Duration = duration;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getAssessment() {
		return Assessment;
	}

	public void setAssessment(String assessment) {
		Assessment = assessment;
	}

	@Override
	public String toString() {
		return "Features [id=" + id + ", lectures=" + lectures + ", Quiz=" + Quiz + ", Duration=" + Duration
				+ ", Language=" + Language + ", Assessment=" + Assessment + "]";
	}

	public Features(Long id, @NotNull int lectures, @NotNull int quiz, @NotNull double duration,
			@NotBlank String language, @NotBlank String assessment) {
		super();
		this.id = id;
		this.lectures = lectures;
		Quiz = quiz;
		Duration = duration;
		Language = language;
		Assessment = assessment;
	}

	public Features() {
		super();
		// TODO Auto-generated constructor stub
	}

}
