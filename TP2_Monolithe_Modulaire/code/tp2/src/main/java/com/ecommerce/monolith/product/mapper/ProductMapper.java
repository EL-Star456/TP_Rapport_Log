package com.ecommerce.monolith.product.mapper;

import com.ecommerce.monolith.product.dto.CreateProductRequest;
import com.ecommerce.monolith.product.dto.ProductDTO;
import com.ecommerce.monolith.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    // Convertit une entité Product en DTO
    ProductDTO toDTO(Product product);

    // Convertit une liste d'entités en liste de DTOs
    List<ProductDTO> toDTOList(List<Product> products);

    // Convertit une requête en entité Product
    Product toEntity(CreateProductRequest request);

    // Met à jour une entité existante
    @Mapping(target = "id", ignore = true)
    void updateEntity(CreateProductRequest request, @MappingTarget Product product);
}