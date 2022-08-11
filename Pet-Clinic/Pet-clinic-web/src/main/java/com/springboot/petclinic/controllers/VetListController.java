package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetListController {

    private final VetServiceMap vetServiceMap;

    public VetListController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"/vets", "/vets/index"})
    public String listVets(Model model){
        model.addAttribute("vets",vetServiceMap.findAll());
        return "vets/index";
    }
}
