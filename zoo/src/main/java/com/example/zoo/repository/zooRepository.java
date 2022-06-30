package com.example.zoo.repository;

import com.example.zoo.model.Animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface zooRepository extends JpaRepository<Animals, Long> {
    //List<Animals> findByAnimalID(int id);
}
