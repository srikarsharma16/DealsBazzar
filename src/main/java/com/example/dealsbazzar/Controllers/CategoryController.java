package com.example.dealsbazzar.Controllers;

import java.util.List;

import com.example.dealsbazzar.Models.Category;
import com.example.dealsbazzar.Services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealbazzar")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCategory")
    public ResponseEntity saveCategory(@RequestBody Category category)
    {
        Category newCategory = categoryService.saveCategory(category);
        if(newCategory==null)
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        else
            return ResponseEntity.ok(newCategory);
    }

    @GetMapping("/fetchCategory")
    public ResponseEntity loadCategory()
    {
        List<Category> c= categoryService.loadCategory();
        return ResponseEntity.ok(c);
    }

    @PutMapping("/updateCategory")
	public ResponseEntity updateCategory(@RequestBody Category category) 
	{		
		Category newCategory = categoryService.updateCategory(category);	
		if(newCategory==null)
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);		
		else
			return ResponseEntity.ok(newCategory);
	}
	
	@DeleteMapping("/deleteCategory/{id}")
	public ResponseEntity deleteCategory(@PathVariable String id) 
	{		
		System.out.println(id);
		Category category = categoryService.get(id);
		if(category==null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);		
		else
		{
			boolean result = categoryService.deleteCategory(category);
			if(result)
				return new ResponseEntity<>(HttpStatus.OK);	
			else
				return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
		}
	}

}
