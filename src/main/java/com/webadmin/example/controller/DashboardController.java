package com.webadmin.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class DashboardController {

    //@RequestMapping(value = "pages/dashboard")
    public ModelMap mmDashboard() {
        return new ModelMap();
    }

}
