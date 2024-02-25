package com.desafios.jogomes.desafio01anotaai.domain.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDTO {
    private String id;
    private String title;
    private String ownerId;
    private String description;
}
