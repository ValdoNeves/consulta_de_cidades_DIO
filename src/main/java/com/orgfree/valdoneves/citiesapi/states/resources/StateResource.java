package com.orgfree.valdoneves.citiesapi.states.resources;

import com.orgfree.valdoneves.citiesapi.states.entities.State;
import com.orgfree.valdoneves.citiesapi.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
