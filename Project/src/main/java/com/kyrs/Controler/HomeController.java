//package com.kyrs.Controler;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @PreAuthorize("isAuthenticated()")
//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/admin")
//    public String admin() {
//        return "admin";
//    }
//}
