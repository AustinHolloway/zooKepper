package com.example.zoo.controller;

import com.example.zoo.model.Animals;
import com.example.zoo.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animals") //localhost:portnum/animals
public class AnimalController {

    private AnimalService animalService;

    public AnimalController (AnimalService animalService){
        super();
        this.animalService = animalService;
    }

    public AnimalService animalService(){
        return animalService;
    }

    public void setAnimalService(AnimalService animalService){
        this.animalService = animalService;
    }

    @PostMapping("/add")
    public Animals addAnimal(@RequestBody Animals animal){
        return animalService.addAnimal(animal);
    }

    @GetMapping("/all")
    public List<Animals> getAllAnimalId(){
        return animalService.findAll();
    }

    @GetMapping("/findAnimal{id}")
    public List<Animals> getAnimalById(@PathVariable("id") long animalId){
        return animalService.findByAnimalID(animalId);
    }

    @DeleteMapping("/deleteAnimal{id}")
    public void deleteById(long animalId){
        animalService.deleteById(animalId);
    }


}
