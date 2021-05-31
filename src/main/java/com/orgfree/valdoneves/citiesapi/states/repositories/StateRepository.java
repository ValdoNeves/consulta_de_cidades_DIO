package com.orgfree.valdoneves.citiesapi.states.repositories;

import com.orgfree.valdoneves.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
