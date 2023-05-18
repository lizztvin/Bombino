package com.kyrs.Controler;

import com.kyrs.Interface.OrderRepository;
import com.kyrs.Table.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public ModelAndView showOrderForm() {
        ModelAndView modelAndView = new ModelAndView("orderForm");
        return modelAndView;
    }

    @PostMapping
    public String processOrderForm(@ModelAttribute Order order) {
        orderRepository.save(order);
        return "redirect:/order/success";
    }
    @GetMapping("/success")
    public ModelAndView showOrderConfirmation() {
        Order lastOrder = orderRepository.findTopByOrderByIdDesc();
        ModelAndView modelAndView = new ModelAndView("orderConfirmation");
        modelAndView.addObject("orders", lastOrder);
        return modelAndView;
    }
//    @GetMapping("/success")
//    public ModelAndView showOrderConfirmation() {
//        List<Order> orders = orderRepository.findAll();
//        ModelAndView modelAndView = new ModelAndView("orderConfirmation");
//        modelAndView.addObject("orders", orders);
//        return modelAndView;
//    }
//    @GetMapping("/success")
//    public ModelAndView showOrderConfirmation() {
//        List<Order> orders = orderRepository.findAll();
//        for(Order order : orders) {
//            System.out.println(order.toString());
//        }
//        ModelAndView modelAndView = new ModelAndView("orderConfirmation");
//        modelAndView.addObject("orders", orders);
//        return modelAndView;
//    }
}
