package com.webadmin.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class FormElementsController {

    //@RequestMapping(value = "pages/form-elements")
    public ModelMap mmFormElements() {
        return new ModelMap();
    }

}
