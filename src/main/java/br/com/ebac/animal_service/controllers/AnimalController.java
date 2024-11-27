package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controller de modo a realizar métdodos http, definir paths e executar ações de usuário
@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    //General animals
    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findNotAdopted();
    }

    @GetMapping("/is-adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }

    //Dogs
    @GetMapping("/dogs")
    private List<Animal> findDogs(){
        return repository.findByDogs();
    }

    @GetMapping("/dogs/not-adopted")
    private List<Animal> findDogsNotAdopted(){
        return repository.findDogsNotAdopted();
    }

    @GetMapping("/dogs/adopted")
    private List<Animal> findDogsAdopted(){
        return repository.findDogsAdopted();
    }

    //Cats
    @GetMapping("/cats")
    private List<Animal> findCats(){
        return repository.findByCats();
    }

    @GetMapping("/cats/not-adopted")
    private List<Animal> findNotAdoptedCats(){
        return repository.findCatsNotAdopted();
    }

    @GetMapping("/cats/adopted")
    private List<Animal> findCatsAdopted(){
        return repository.findCatsAdopted();
    }

}
