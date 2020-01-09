package com.nitkart.starter.h2jpastarter.service;

import com.nitkart.starter.h2jpastarter.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private SkillRepository skillRepository;

    public Player findPlayer(Integer id) {
        return playerRepository.findById(id).get();
    }

    public Address findAddress(Integer id) { return  addressRepository.findById(id).get();}

    public Skill findSkill(Integer id) { return  skillRepository.findById(id).get();}

    public Player createPlayer(Player player) {
//        Integer nextId = playerRepository.findFirstByOrderByIdDesc().getId() + 1 ;
//        player.setId(nextId);
        Player savedPlayer = playerRepository.save(player);
        return savedPlayer;
    }
}
