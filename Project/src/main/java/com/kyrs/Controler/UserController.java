package com.kyrs.Controler;


import com.kyrs.Interface.UserRepository;
import com.kyrs.Table.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tovars")
public class UserController {
    @Autowired
    private UserRepository tovarRepository;

    @GetMapping("/")
    public List<Product> getAllTovars() {
        return tovarRepository.findAll();
    }

    @PostMapping("/")
    public Product createTovar(@RequestBody Product tovar) {
        return tovarRepository.saveAndFlush(tovar);
    }

    @GetMapping("/{tovarId}")
    public ResponseEntity<Product> getTovarById(@PathVariable Long tovarId) {
        Optional<Product> tovar = tovarRepository.findById(tovarId);
        if (tovar.isPresent()) {
            return ResponseEntity.ok(tovar.get());
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Tovar not found"
            );
        }
    }

    @PutMapping("/{tovarId}")
    public Product updateTovar(@PathVariable Long tovarId, @RequestBody Product tovar) {
        Product existingTovar = tovarRepository.getOne(tovarId);
        existingTovar.setName(tovar.getName());
        existingTovar.setPrice(tovar.getPrice());
        return tovarRepository.saveAndFlush(existingTovar);
    }

    @DeleteMapping("/{tovarId}")
    public void deleteTovar(@PathVariable Long tovarId) {
        tovarRepository.deleteById(tovarId);
    }
}