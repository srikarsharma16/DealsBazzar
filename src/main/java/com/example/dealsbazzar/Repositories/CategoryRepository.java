package com.example.dealsbazzar.Repositories;

import com.example.dealsbazzar.Models.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
    
}
