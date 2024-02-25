package com.desafios.jogomes.desafio01anotaai.domain.product;

import com.desafios.jogomes.desafio01anotaai.repository.category.data.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private String id;
    private String title;
    private String ownerId;
    private String description;
    private Double price;
    private Category category;
}
