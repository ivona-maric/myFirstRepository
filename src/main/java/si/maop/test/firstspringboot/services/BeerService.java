package si.maop.test.firstspringboot.services;

import si.maop.test.firstspringboot.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
