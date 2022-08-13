package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.map.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerListController {

    private final OwnerMapService ownerMapService;

    public OwnerListController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"","/index"})
    public String ownerList(Model model){
        model.addAttribute("owners", ownerMapService.findAll());
        return "owner/index";
    }
}
