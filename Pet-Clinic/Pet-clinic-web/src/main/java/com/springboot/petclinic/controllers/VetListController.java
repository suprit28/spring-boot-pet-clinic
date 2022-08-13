package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.map.VetMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetListController {

    private final VetMapService vetMapService;

    public VetListController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping({"/vets", "/vets/index"})
    public String listVets(Model model){
        model.addAttribute("vets", vetMapService.findAll());
        return "vets/index";
    }
}
