package com.example.mainDb.repo;

import com.example.mainDb.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MessageRepo extends CrudRepository <Message, Integer> {
    List<Message> findBySeloIgnoreCaseContaining (String selo);
    List<Message> findAllById (Integer id);
}


