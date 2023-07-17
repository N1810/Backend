package com.Backend.Backend.Entity.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.Backend.Entity.CategoryData;

@Repository
public interface CategoryDataDao extends JpaRepository<CategoryData, Long> {
	
}
