package com.kyrs.Interface;

import com.kyrs.Table.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // методы для работы с товарами
}
