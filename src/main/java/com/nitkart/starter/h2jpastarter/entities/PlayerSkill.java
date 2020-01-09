package com.nitkart.starter.h2jpastarter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PLAYER_SKILL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerSkill {
    @EmbeddedId
    PlayerSkillId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("playerId")
    Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skillId")
    Skill skill;

    @Column(name = "last_used_date")
    private Date lastUsed = new Date();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerSkill that = (PlayerSkill) o;
        return player.equals(that.player) &&
                skill.equals(that.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, skill);
    }
}
