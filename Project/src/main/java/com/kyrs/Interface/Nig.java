package com.kyrs.Interface;

import com.kyrs.Table.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface Nig extends CrudRepository<Product, Long> {
    List<Product> findAll();
}
