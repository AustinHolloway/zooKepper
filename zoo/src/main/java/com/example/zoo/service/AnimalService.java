package com.example.zoo.service;

import com.example.zoo.model.Animals;
import com.example.zoo.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private ZooRepository zooRepository;

    public AnimalService(ZooRepository zooRepository){
        super();
        this.zooRepository = zooRepository;
    }

    public ZooRepository getZooRepository() {
        return zooRepository;
    }

    public void setZooRepository(ZooRepository zooRepository){
        this.zooRepository = zooRepository;
    }

    public List<Animals> findByAnimalID(Long animalId){
        return zooRepository.findByAnimalID(animalId);
    }

    public List<Animals> findAll(){
        return zooRepository.findAll();
    }

    public Animals addAnimal(Animals animal){
        return zooRepository.save(animal);
    }

//    public Optional<Animals> findBySpeciesType(String speciesType){
//        return zooRepository
//    }


    public void deleteById(Long animalId){
        zooRepository.deleteById(animalId);
    }


}
