package com.lectures.SampleProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lectures.SampleProject.model.Category;
import com.lectures.SampleProject.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
//	private List<Category> categories = new ArrayList<Category>();
	
	
	private CategoryRepository categoryRepository;
	

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategories() {		
		return categoryRepository.findAll();
	}

	@Override
	public void createCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public String deleteCategory(Long categoryID) {
	    Category category = categoryRepository.findById(categoryID)
	        .orElseThrow(() -> new ResponseStatusException(
	            HttpStatus.NOT_FOUND, "Category not found"));

	    categoryRepository.delete(category);
	    return "Category deleted successfully";
	}


	@Override
	public String updateCategory(Long categoryID, Category updateCategory) {
	    Category category = categoryRepository.findById(categoryID)
	        .orElseThrow(() -> new ResponseStatusException(
	            HttpStatus.NOT_FOUND, "Category not found"));

	    category.setCategoryName(updateCategory.getCategoryName());
	    categoryRepository.save(category);

	    return "Updated Successfully";
	}

}
