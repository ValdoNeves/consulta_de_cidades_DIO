package com.orgfree.valdoneves.citiesapi.cities.resources;

import com.orgfree.valdoneves.citiesapi.cities.entities.City;
import com.orgfree.valdoneves.citiesapi.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cidades")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository){
        this.repository = repository;
    }

    /*
    @GetMapping
    public List<City> cities() {
      return repository.findAll();
    }*/

    // Paginação
    @GetMapping
    public Page<City> cities(final Pageable page) {
        return repository.findAll(page);
    }
}
