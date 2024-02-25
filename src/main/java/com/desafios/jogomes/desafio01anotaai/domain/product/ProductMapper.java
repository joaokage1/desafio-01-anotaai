package com.desafios.jogomes.desafio01anotaai.domain.product;

import com.desafios.jogomes.desafio01anotaai.repository.products.data.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);
}
