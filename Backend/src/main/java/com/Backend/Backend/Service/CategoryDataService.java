package com.Backend.Backend.Service;

import java.util.List;
import com.Backend.Backend.Entity.CategoryData;

public interface CategoryDataService {

	public List<CategoryData> getallCategoryData();

	public CategoryData getCategory(long CategoryId);

	public CategoryData AddcategoryData(CategoryData categoryData);

	public CategoryData updatecategoryData(CategoryData categoryData);

	public void deletecategoryData(long parseLong);

}
