package com.desafios.jogomes.desafio01anotaai.repository.products;

import com.desafios.jogomes.desafio01anotaai.repository.products.data.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Product, String> {
}
