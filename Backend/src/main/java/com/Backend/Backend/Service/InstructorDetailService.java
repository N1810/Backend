package com.Backend.Backend.Service;

import java.util.List;

import com.Backend.Backend.Entity.InstructorDetails;

public interface InstructorDetailService {
	public List<InstructorDetails> getallInstructorDetails();

	public InstructorDetails getInstructor(long InstructorId);

	public InstructorDetails AddInstructorDetails(InstructorDetails instructorDetails);

	public InstructorDetails updateInstructorDetails(InstructorDetails instructorDetails);

	public void deleteInstructorDetails(long parseLong);

}
