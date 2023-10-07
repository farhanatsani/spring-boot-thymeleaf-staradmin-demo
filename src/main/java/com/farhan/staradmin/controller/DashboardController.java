package com.farhan.staradmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pages")
public class DashboardController {


    @GetMapping(value = "dashboard")
    public ModelMap mmDashboard() {
        // todo get apple stock price
        String test = "test";
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("key", "Total Revenue");
        System.out.println("test: " + modelMap.toString());
        return modelMap;
    }
}
