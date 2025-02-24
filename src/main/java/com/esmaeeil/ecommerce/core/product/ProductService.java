package com.esmaeeil.ecommerce.core.product;

import com.esmaeeil.ecommerce.core.product.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public BigDecimal getProductPriceById(Long productId){
        return productRepository
                .findPriceById(productId)
                .orElseThrow(()-> new RuntimeException("no product was found !!!"));
    }


    public List<ProductDto> getAllProducts() {
        return ProductDataMapper.toDtoList(productRepository.findAll());
    }
}
