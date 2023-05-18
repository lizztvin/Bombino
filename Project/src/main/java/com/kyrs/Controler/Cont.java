package com.kyrs.Controler;

import com.kyrs.Service.ProductService;
import com.kyrs.Table.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class Cont {
    @Autowired
    private ProductService productService;

    @GetMapping("/index")
    public String home(Model model) {
        List<Product> accounts = productService.getAllProducts();
        model.addAttribute("accounts", accounts);
        return "index";
    }
}
