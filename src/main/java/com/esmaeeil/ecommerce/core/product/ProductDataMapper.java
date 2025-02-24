package com.esmaeeil.ecommerce.core.product;

import com.esmaeeil.ecommerce.core.product.dto.ProductDto;

import java.util.List;

public class ProductDataMapper {

    public static ProductDto toDto(Product product){
        if (product == null) {
            return null;
        }
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setSummary(product.getSummary());
        productDto.setPrice(product.getPrice());
        productDto.setCategoryName(product.getCategory().getName());

        return productDto;
    }


    public static List<ProductDto> toDtoList(List<Product>products){
        return products.stream().map(ProductDataMapper::toDto).toList();
    }
}
