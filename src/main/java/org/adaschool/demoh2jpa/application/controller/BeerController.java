package org.adaschool.demoh2jpa.application.controller;

import org.adaschool.demoh2jpa.application.service.BeerService;
import org.adaschool.demoh2jpa.domain.entity.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public record BeerController(
  BeerService beerService
) {

    @PostMapping("/beers")
    public ResponseEntity<?> createBeer(@RequestBody Beer beer){
        beerService.createBeer(beer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

  // Crear un endpoint POST Recibir una entidad Beer
  // Return ResponseStatus | HttpStatus.CREATED


}
