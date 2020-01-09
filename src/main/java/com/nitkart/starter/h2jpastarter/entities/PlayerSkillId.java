package com.nitkart.starter.h2jpastarter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerSkillId implements Serializable {
    @Column(name = "player_id")
    private Integer playerId;
    @Column(name = "skill_id")
    private Integer skillId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerSkillId that = (PlayerSkillId) o;
        return playerId.equals(that.playerId) &&
                skillId.equals(that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, skillId);
    }
}
