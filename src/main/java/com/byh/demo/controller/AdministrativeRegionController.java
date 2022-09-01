package com.byh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrative_region")
public class AdministrativeRegionController {

    @GetMapping("/test")
    public String test(){
        return "11111";
    }

}
