package com.desafios.jogomes.desafio01anotaai.domain.category;

import com.desafios.jogomes.desafio01anotaai.repository.category.data.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO toDTO(Category category);

    Category toEntity(CategoryDTO categoryDTO);
}
