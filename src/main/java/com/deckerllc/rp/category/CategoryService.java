package com.deckerllc.rp.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by molayodecker on 19/10/2017.
 */
@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(String title, String url){
        String cl = String.valueOf(CategoryList.findByList(title));
        if(cl.equalsIgnoreCase(title)){
            categoryRepository.save( new Category(title,url));
        }
        return null;
    }

    public Iterable<Category> lookup(){
       return categoryRepository.findAll();
    }

    public long totalNumberOfCategories(){
        return categoryRepository.count();
    }
}
