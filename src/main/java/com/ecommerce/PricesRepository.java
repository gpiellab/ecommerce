package com.ecommerce;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PricesRepository extends CrudRepository<Prices, Long> {

    List<Prices> findByName(String name);

}
