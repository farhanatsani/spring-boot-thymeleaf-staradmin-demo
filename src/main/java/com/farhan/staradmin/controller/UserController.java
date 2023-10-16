package com.farhan.staradmin.controller;

import com.farhan.staradmin.model.UserSample;
import com.farhan.staradmin.service.MemberService;
import com.farhan.staradmin.service.UserSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "pages")
public class UserController {

    @Autowired
    private UserSampleService userSampleService;


    @GetMapping(value = "user")
    public ModelMap mmDashboard() {
        // todo get apple stock price
        ModelMap modelMap = new ModelMap();
        ArrayList<UserSample> users = this.userSampleService.findUser();
        modelMap.addAttribute("users", users);
        return modelMap;
    }
}
