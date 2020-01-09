package com.nitkart.starter.h2jpastarter.controllers;

import com.nitkart.starter.h2jpastarter.entities.Player;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericRestControllerTest {

    private String baseUrl = "http://localhost:8080";

    @Test
    public void testGetPlayer() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(baseUrl + "/players/1");
        ResponseEntity<Player> result = restTemplate.getForEntity(uri, Player.class);
        assertThat(result.getStatusCodeValue()).isEqualTo(200);
        assertThat(result.getBody().getName()).isEqualTo("DHONI");
    }

    @Test
    public void testPostPlayer() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(baseUrl + "/players");
        Player inPlayer = new Player(null, "PANDYA", Collections.emptyList());
        ResponseEntity<Player> result = restTemplate.postForEntity(uri, inPlayer, Player.class);
        assertThat(result.getStatusCodeValue()).isEqualTo(200);
        assertThat(result.getBody().getName()).isEqualTo("PANDYA");
        assertThat(result.getBody().getId()).isNotNull();
    }

}