package com.esmaeeil.ecommerce.core.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface CartRepository extends JpaRepository<Cart,Long> {

    @Query("select c from Cart c join fetch c.cartItems where c.username = :username")
    Optional<Cart> findByUsername(@Param("username") String username);
}
