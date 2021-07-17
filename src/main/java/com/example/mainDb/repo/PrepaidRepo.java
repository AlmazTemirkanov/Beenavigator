package com.example.mainDb.repo;

import com.example.mainDb.domain.Prepaid;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrepaidRepo extends CrudRepository <Prepaid, Integer> {
    List<Prepaid> findBycountryIgnoreCaseContaining (String country);
    List<Prepaid> findAllById (Integer id);
}
