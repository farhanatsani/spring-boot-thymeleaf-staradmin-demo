package com.webadmin.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        //viewControllerRegistry.addViewController("/").setViewName("redirect:/pages/dashboard");
    }

}
