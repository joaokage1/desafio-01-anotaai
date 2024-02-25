package com.desafios.jogomes.desafio01anotaai.repository.products.data;

import com.desafios.jogomes.desafio01anotaai.repository.category.data.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String title;
    private String ownerId;
    private String description;
    private Double price;
    private Category category;
}
