package com.orgfree.valdoneves.citiesapi.cities.resources;

import com.orgfree.valdoneves.citiesapi.cities.entities.City;
import com.orgfree.valdoneves.citiesapi.cities.repositories.CityRepository;

import com.orgfree.valdoneves.citiesapi.cities.service.DistanceService;
import com.orgfree.valdoneves.citiesapi.cities.service.EarthRadius;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/distancia")
public class DistanceResource {

    private final DistanceService service;

    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    public DistanceResource(DistanceService service){
        this.service = service;
    }

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2){
        log.info("byPoints");
        return service.distanceByPointsInMiles(city1, city1);
    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2){
        log.info("byCube");
        return service.distanceByCubeInMeters(city1,city2);
    }

//    @GetMapping("/by-math")
//    public Double byMath(@RequestParam(name = "from") final Long city1,
//                         @RequestParam(name = "to") final Long city2,
//                         @RequestParam final EarthRadius unit){
//        log.info("byMath");
//        return service.distanceUsingMath(city1, city2, unit);
//    }


}
