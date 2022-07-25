package com.springboot.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerListController {

    @RequestMapping({"","/index"})
    public String ownerList(){
        return "owner/index";
    }
}
