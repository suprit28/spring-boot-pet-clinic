package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.map.VetMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetMapService vetMapService;

    public VetController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetMapService.findAll());
        return "vets/index";
    }
}
