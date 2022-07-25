package com.springboot.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetListController {

    @RequestMapping({"/vets", "/vets/index"})
    public String listVets(){
        return "vets/index";
    }
}
