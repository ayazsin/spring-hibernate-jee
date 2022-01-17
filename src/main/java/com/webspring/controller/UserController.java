package com.webspring.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;


import com.webspring.model.Order;
import com.webspring.model.User;
import com.webspring.service.OrderService;
import com.webspring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserController {


    @Autowired
    private Service userService;

    @Autowired
    private OrderService orderService;


    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        /* 2 actions, input + list mapped on / */
        model.addAttribute("user", new User());
        model.addAttribute("users", userService.list());

        model.addAttribute("order", new Order());
        model.addAttribute("orders", orderService.listOfDisputed());

        return "userForm";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") @Valid User user,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            /* redisplay */
            model.addAttribute("users", userService.list());
            model.addAttribute("orders", orderService.listOfDisputed());
            return "userForm";
        }
        /* no error : save in db */
        userService.save(user);

        return "redirect:/";
    }





}
