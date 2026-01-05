package com.lectures.SampleProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lectures.SampleProject.model.Category;

// we have to write two attribute table name and the type of the primary key present in the table or the entity class 
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
