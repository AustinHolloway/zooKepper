package com.example.zoo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @Column(name = "ID", nullable = false)
    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long animalID;

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
        this.animalID = id;
        this.nickname = nickname;
        this.species = species;
    }



    @Override
    public String toString() {
        return "animals{" +
                "id=" + animalID +
                ", nickname='" + nickname + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
