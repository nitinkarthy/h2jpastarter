package com.nitkart.starter.h2jpastarter.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PLAYER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="all_seq", initialValue=10, allocationSize=10)
public class Player {

    @Column(name = "id")
    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="all_seq")
    Integer id;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "player")
    @JsonIgnore
//    https://stackoverflow.com/questions/45783753/spring-data-jpa-onetoone-annotation-infinite-recursion-error
    List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address){
        addresses.add(address);
        address.setPlayer(this);
    }

    public void removeAddress(Address address){
        addresses.remove(address);
        address.setPlayer(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id.equals(player.id);
    }
}