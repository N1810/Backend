package com.Backend.Backend.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Backend.Backend.Entity.CategoryData;
import com.Backend.Backend.Entity.Course;
import com.Backend.Backend.Entity.CourseDetails;
import com.Backend.Backend.Entity.Features;
import com.Backend.Backend.Entity.InstructorDetails;
import com.Backend.Backend.Service.CategoryDataService;
import com.Backend.Backend.Service.CourseDetailsService;
import com.Backend.Backend.Service.CourseService;
import com.Backend.Backend.Service.FeatureService;
import com.Backend.Backend.Service.InstructorDetailService;

@RestController
public class MyController {
	@Autowired
	CategoryDataService categoryservice;
	@Autowired
	CourseService courseservice;
	@Autowired
	InstructorDetailService instructorservice;
	@Autowired
	FeatureService featureService;
	@Autowired
	CourseDetailsService coursedetailsService;

	@GetMapping("/test")
	public String hello() {
		return "Working";
	}

	// Get All Category
	@GetMapping("/AllCategory")
	public List<CategoryData> getallCategoryData() {
		return categoryservice.getallCategoryData();

	}

	@GetMapping("OneCategory/{CategoryId}")
	public CategoryData getCategory(@PathVariable Long CategoryId) {
		return categoryservice.getCategory(CategoryId);
	}

	@PostMapping("/AddCategory")
	public CategoryData AddcategoryData(@RequestBody CategoryData categoryData) {
		return this.categoryservice.AddcategoryData(categoryData);

	}

	@PutMapping("/updatecategoryData")
	public CategoryData updatecategoryData(@RequestBody CategoryData categoryData) {
		return this.categoryservice.updatecategoryData(categoryData);

	}

	@DeleteMapping("/Deletecategory/{CategoryId}")
	public ResponseEntity<HttpStatus> deletecategoryData(@PathVariable String CategoryId) {
		try {
			this.categoryservice.deletecategoryData(Long.parseLong(CategoryId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/AllCourse")
	public List<Course> getallCourse() {
		return courseservice.getallCourse();

	}

	@GetMapping("OneCourse/{CourseId}")
	public Course getCourse(@PathVariable Long CourseId) {
		return courseservice.getCourse(CourseId);
	}

	// Add The Course
	@PostMapping("/AddCourse")
	public Course Addcourse(@RequestBody Course Course) {
		return this.courseservice.Addcourse(Course);

	}

	@PutMapping("/UpdateCourse")
	public Course updatecourse(@RequestBody Course course) {
		return this.courseservice.updatecourse(course);

	}

	@DeleteMapping("/Deletecourse/{courseId}")
	public ResponseEntity<HttpStatus> deletecourse(@PathVariable String courseId) {
		try {
			this.courseservice.deletecourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/AllInstructor")
	public List<InstructorDetails> getallInstructorDetails() {
		return instructorservice.getallInstructorDetails();

	}

	@GetMapping("OneInstructor/{InstructorId}")
	public InstructorDetails getInstructor(@PathVariable Long InstructorId) {
		return instructorservice.getInstructor(InstructorId);
	}

	@PostMapping("/Addinstructor")
	public InstructorDetails AddInstructorDetails(@RequestBody InstructorDetails instructordetails) {
		return this.instructorservice.AddInstructorDetails(instructordetails);

	}

	@PutMapping("/Updateinstructor")
	public InstructorDetails updateInstructorDetails(@RequestBody InstructorDetails instructordetails) {
		return this.instructorservice.updateInstructorDetails(instructordetails);

	}

	@DeleteMapping("/Deleteinstructor/{instructorId}")
	public ResponseEntity<HttpStatus> deleteInstructorDetails(@PathVariable String instructorId) {
		try {
			this.instructorservice.deleteInstructorDetails(Long.parseLong(instructorId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/AllFeatures")
	public List<Features> getallFeatures() {
		return featureService.getallFeatures();

	}

	@PostMapping("/AddFeatures")
	public Features AddFeatures(@RequestBody Features features) {
		return this.featureService.AddFeatures(features);

	}

	@GetMapping("OneFeature/{FeatureId}")
	public Features getFeature(@PathVariable Long FeatureId) {
		return featureService.getFeature(FeatureId);
	}

	@PutMapping("/updateFeatures")
	public Features updateFeatures(@RequestBody Features features) {
		return this.featureService.updateFeatures(features);

	}

	@DeleteMapping("/DeleteFeatures/{FeatureId}")
	public ResponseEntity<HttpStatus> deleteFeatures(@PathVariable String FeatureId) {
		try {
			this.featureService.deleteFeatures(Long.parseLong(FeatureId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/AllCourseDetails")
	public List<CourseDetails> getallCourseDetails() {
		return coursedetailsService.getallCourseDetails();

	}

	@GetMapping("OneCourseDetail/{CourseDetailId}")
	public CourseDetails getCourseDetails(@PathVariable Long CourseDetailId) {
		return coursedetailsService.getCourseDetails(CourseDetailId);
	}

	@PostMapping("/AddCourseDetails")
	public CourseDetails AddCourseDetails(@RequestBody CourseDetails coursedetails) {
		return this.coursedetailsService.AddCourseDetails(coursedetails);

	}

	@PutMapping("/updateCourseDetails")
	public CourseDetails updateCourseDetails(@RequestBody CourseDetails coursedetails) {
		return this.coursedetailsService.updateCourseDetails(coursedetails);

	}

	@DeleteMapping("/DeleteCourseDetails/{CourseDetailsId}")
	public ResponseEntity<HttpStatus> deleteCourseDetails(@PathVariable String CourseDetailsId) {
		try {
			this.coursedetailsService.deleteCourseDetails(Long.parseLong(CourseDetailsId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
