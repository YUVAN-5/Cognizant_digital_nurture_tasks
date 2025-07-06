package com.example.QuickExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuickExample.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>
{

}
