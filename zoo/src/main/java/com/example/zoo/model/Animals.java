package com.example.zoo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "ANIMALS")
public class Animals {
    @Id
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private int id;

    @Column(name = "NICKNAME")
    @Getter
    @Setter
    private String nickname;

    @Column(name = "SPECIES")
    @Getter
    @Setter
    private String species;

    public Animals(){
        super();
        // TODO Auto-generated constructor stub
    }

    public Animals(int id, String nickname, String species){
        super();
        this.id = id;
        this.nickname = nickname;
        this.species = species;
    }



    @Override
    public String toString() {
        return "animals{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
