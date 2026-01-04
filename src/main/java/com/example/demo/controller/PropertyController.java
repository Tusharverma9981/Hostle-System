package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner/property")
public class PropertyController {

    @GetMapping("/add")
    public String addProperty() {
        return "owner/add-property";
    }

    @GetMapping("/list")
    public String propertyList() {
        return "owner/property-list";
    }

    @GetMapping("/details")
    public String propertyDetails() {
        return "user/property-details";
    }
}
