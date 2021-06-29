package com.example.beelineDb.repo;

import com.example.beelineDb.domain.MyBeeline;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MyBeelineRepo extends CrudRepository<MyBeeline, Integer> {
    List<MyBeeline> findByMsisdn (String msisdn);
}
