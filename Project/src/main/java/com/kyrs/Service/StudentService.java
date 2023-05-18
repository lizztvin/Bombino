package com.kyrs.Service;

import com.kyrs.Interface.Nig;
import com.kyrs.Table.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private Nig studentRepository;

    public List<Product> getAllStudents() {
        return studentRepository.findAll();
    }
}
