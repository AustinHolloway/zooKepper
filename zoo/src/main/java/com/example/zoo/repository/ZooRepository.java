package com.example.zoo.repository;

import com.example.zoo.model.Animals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZooRepository extends JpaRepository<Animals, Long> {

    List<Animals> findByAnimalID(Long Id);


}
