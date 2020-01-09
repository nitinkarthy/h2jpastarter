package com.nitkart.starter.h2jpastarter.controllers;

import com.nitkart.starter.h2jpastarter.entities.Player;
import com.nitkart.starter.h2jpastarter.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericRestController {
    @Autowired
    private GenericService genericService;

    @RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
    Player getPlayer(@PathVariable Integer id){
        return  genericService.findPlayer(id);
    }

    @RequestMapping(value = "/players", method = RequestMethod.POST)
    Player createPlayer(@RequestBody Player player){
        return  genericService.createPlayer(player);
    }
}
