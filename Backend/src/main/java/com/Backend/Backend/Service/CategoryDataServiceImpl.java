package com.Backend.Backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.Backend.Entity.CategoryData;
import com.Backend.Backend.Entity.Dao.CategoryDataDao;

@Service
public class CategoryDataServiceImpl implements CategoryDataService {
	@Autowired
	CategoryDataDao categorydatadao;

	@Override
	public List<CategoryData> getallCategoryData() {
		// TODO Auto-generated method stub
		return categorydatadao.findAll();
	}

	@Override
	public CategoryData AddcategoryData(CategoryData categoryData) {
		// TODO Auto-generated method stub
		categorydatadao.save(categoryData);
		return categoryData;
	}

	@Override
	public CategoryData updatecategoryData(CategoryData categoryData) {
		// TODO Auto-generated method stub
		categorydatadao.save(categoryData);
		return categoryData;
	}

	@Override
	public void deletecategoryData(long parseLong) {
		// TODO Auto-generated method stub
		CategoryData entity = categorydatadao.getOne(parseLong);
		categorydatadao.delete(entity);
	}

	@Override
	public CategoryData getCategory(long CategoryId) {
		// TODO Auto-generated method stub

		Optional<CategoryData> categoryDataOptional = categorydatadao.findById(CategoryId);
		return categoryDataOptional.orElse(null);
	}


}
