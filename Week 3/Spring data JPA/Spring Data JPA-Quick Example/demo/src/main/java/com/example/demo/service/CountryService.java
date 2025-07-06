package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@Service
public class CountryService {

  @Autowired
  private CountryRepository repository;

  public List<Country> getAllCountries() {
    return repository.findAll();
  }

  public void addCountry(Country country) {
    repository.save(country);
  }
}
