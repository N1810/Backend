package com.Backend.Backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Backend.Entity.Features;
import com.Backend.Backend.Entity.InstructorDetails;
import com.Backend.Backend.Entity.Dao.FeaturesDao;

@Service
public class FeaturesServiceImpl implements FeatureService {
	@Autowired
	FeaturesDao featuresdao;

	@Override
	public List<Features> getallFeatures() {
		// TODO Auto-generated method stub
		return featuresdao.findAll();
	}

	@Override
	public Features AddFeatures(Features features) {
		// TODO Auto-generated method stub
		featuresdao.save(features);
		return features;
	}

	@Override
	public Features updateFeatures(Features features) {
		// TODO Auto-generated method stub
		featuresdao.save(features);
		return features;
	}

	@Override
	public void deleteFeatures(long parseLong) {
		// TODO Auto-generated method stub
		Features entity = featuresdao.getOne(parseLong);
		featuresdao.delete(entity);
	}

	@Override
	public Features getFeature(long FeatureId) {
		// TODO Auto-generated method stub
		Optional<Features> FeatureDataOptional = featuresdao.findById(FeatureId);
		return FeatureDataOptional.orElse(null);
	}

}
