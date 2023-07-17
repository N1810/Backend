package com.Backend.Backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Backend.Entity.CategoryData;
import com.Backend.Backend.Entity.InstructorDetails;
import com.Backend.Backend.Entity.Dao.InstructorDetailsDao;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService {
	@Autowired
	InstructorDetailsDao instructordetailsdao;

	@Override
	public List<InstructorDetails> getallInstructorDetails() {
		// TODO Auto-generated method stub
		return instructordetailsdao.findAll();
	}

	@Override
	public InstructorDetails AddInstructorDetails(InstructorDetails instructorDetails) {
		// TODO Auto-generated method stub
		instructordetailsdao.save(instructorDetails);
		return instructorDetails;
	}

	@Override
	public InstructorDetails updateInstructorDetails(InstructorDetails instructorDetails) {
		// TODO Auto-generated method stub
		instructordetailsdao.save(instructorDetails);
		return instructorDetails;
	}

	@Override
	public void deleteInstructorDetails(long parseLong) {
		// TODO Auto-generated method stub
		InstructorDetails entity = instructordetailsdao.getOne(parseLong);
		instructordetailsdao.delete(entity);
	}

	@Override
	public InstructorDetails getInstructor(long InstructorId) {
		// TODO Auto-generated method stub
		Optional<InstructorDetails> InstructorDataOptional = instructordetailsdao.findById(InstructorId);
		return InstructorDataOptional.orElse(null);
	}

}
