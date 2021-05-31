package com.orgfree.valdoneves.citiesapi.repository;

import com.orgfree.valdoneves.citiesapi.contries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
