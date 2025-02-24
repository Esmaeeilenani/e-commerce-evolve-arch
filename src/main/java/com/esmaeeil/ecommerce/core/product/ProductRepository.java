package com.esmaeeil.ecommerce.core.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {

   @Query("select p.price from Product p where p.id =:productId")
    Optional<BigDecimal> findPriceById(@Param("productId") Long productId);
}
