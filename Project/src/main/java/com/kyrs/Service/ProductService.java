package com.kyrs.Service;

import com.kyrs.Interface.Nig;
import com.kyrs.Table.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private Nig productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
