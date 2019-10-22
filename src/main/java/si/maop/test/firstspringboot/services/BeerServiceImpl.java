package si.maop.test.firstspringboot.services;

import org.springframework.stereotype.Service;
import si.maop.test.firstspringboot.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements  BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale").build();
    }
}
