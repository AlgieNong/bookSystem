package com.mengyuan.booksystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ShanMengYuan
 * @date 2025/1/8 20:31
 * @description 基础控制器，控制界面显示
 */
@Controller
public class BaseController {


    @GetMapping("/")
    public String defaultPage(Model model){
        model.addAttribute("page", "login");
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("page", "login");
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("page", "login");
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("page", "register");
        return "register";
    }


}
