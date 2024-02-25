package com.desafios.jogomes.desafio01anotaai.repository.category;

import com.desafios.jogomes.desafio01anotaai.repository.category.data.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
