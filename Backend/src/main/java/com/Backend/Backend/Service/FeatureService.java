package com.Backend.Backend.Service;

import java.util.List;

import com.Backend.Backend.Entity.Features;

public interface FeatureService {
	public List<Features> getallFeatures();

	public Features getFeature(long FeatureId);

	public Features AddFeatures(Features features);

	public Features updateFeatures(Features features);

	public void deleteFeatures(long parseLong);
}
