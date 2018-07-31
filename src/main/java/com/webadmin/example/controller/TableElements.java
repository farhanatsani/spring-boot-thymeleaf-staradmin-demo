package com.webadmin.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class TableElements {

    //@RequestMapping(value = "pages/table-elements")
    public ModelMap mmTableElements() {
        return new ModelMap();
    }

}
