package com.springboot.petclinic.controllers;

import com.springboot.petclinic.services.map.OwnerServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerListController {

    private final OwnerServiceMap ownerServiceMap;

    public OwnerListController(OwnerServiceMap ownerServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
    }

    @RequestMapping({"","/index"})
    public String ownerList(Model model){
        model.addAttribute("owners",ownerServiceMap.findAll());
        return "owner/index";
    }
}
