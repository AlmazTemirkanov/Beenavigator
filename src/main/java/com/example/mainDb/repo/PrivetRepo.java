package com.example.mainDb.repo;

import com.example.mainDb.domain.Privet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrivetRepo extends CrudRepository <Privet, Integer> {
  List <Privet> findByAuthorIgnoreCaseContaining (String author);
  List <Privet> findByTitleIgnoreCaseContaining (String title);

}
