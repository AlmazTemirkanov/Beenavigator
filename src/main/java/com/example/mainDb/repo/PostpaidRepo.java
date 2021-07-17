package com.example.mainDb.repo;

import com.example.mainDb.domain.Postpaid;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostpaidRepo extends CrudRepository <Postpaid, Integer>  {

    List <Postpaid> findBycountryIgnoreCaseContaining (String country);
    List<Postpaid> findAllById (Integer id);
}
