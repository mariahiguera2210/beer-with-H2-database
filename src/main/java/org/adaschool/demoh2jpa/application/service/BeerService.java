package org.adaschool.demoh2jpa.application.service;

import org.adaschool.demoh2jpa.domain.entity.Beer;
import org.adaschool.demoh2jpa.domain.repository.BeerRepository;
import org.springframework.stereotype.Service;

@Service
public record BeerService (
  BeerRepository beerRepository
) {

  public void createBeer(Beer beer){

    beerRepository.save(beer);
    // llamar a la interface del repository save
  }

}
