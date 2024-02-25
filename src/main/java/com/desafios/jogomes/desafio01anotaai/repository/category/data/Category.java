package com.desafios.jogomes.desafio01anotaai.repository.category.data;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@Document(collection = "categories")
public class Category {

    @Id
    private String id;
    private String title;
    private String ownerId;
    private String description;
}
