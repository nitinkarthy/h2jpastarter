package com.nitkart.starter.h2jpastarter.entities;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    public Player findFirstByOrderByIdDesc();
}
