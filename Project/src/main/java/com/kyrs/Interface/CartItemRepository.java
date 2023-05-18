package com.kyrs.Interface;

import com.kyrs.Table.CartItem;
import com.kyrs.Table.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    @Query("SELECT c FROM CartItem c WHERE c.product.id = :product_id")
    CartItem findByProductId(@Param("product_id") Long productId);
    Optional<CartItem> findByProduct(Product product);
}
