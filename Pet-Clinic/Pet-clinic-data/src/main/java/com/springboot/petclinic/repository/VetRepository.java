package com.springboot.petclinic.repository;

import com.springboot.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;


public interface VetRepository extends CrudRepository<Vet, Long> {
}
