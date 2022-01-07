package com.example.dealsbazzar.Services;

import java.util.List;

import com.example.dealsbazzar.Models.Category;
import com.example.dealsbazzar.Repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category)
    {
        try{
            categoryRepository.insert(category);
            return category;
        }catch(Exception e){
            return null;
        }
    }

    public Category get(String id)
    {
        try{
            return categoryRepository.findById(id).get();
        }catch(Exception e)
        {
            return null;
        }
    }

    public List<Category> loadCategory()
    {
        try{
            List<Category> c= categoryRepository.findAll();
            return c;
        }catch(Exception e)
        {
            return null;
        }
    }

    public Category updateCategory(Category category) 
	{
		try {
			categoryRepository.save(category);			
			return category;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Boolean deleteCategory(Category category) 
	{
		try {
			categoryRepository.delete(category);				
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
