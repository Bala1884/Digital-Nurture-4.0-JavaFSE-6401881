package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    
    public void run(String... args) {
      LOGGER.info("\n================= Inside main =================");
      List<Country> countries = countryService.getAllCountries();
      LOGGER.info("\n================= Countries: {} =================\n", countries);
    }

}
