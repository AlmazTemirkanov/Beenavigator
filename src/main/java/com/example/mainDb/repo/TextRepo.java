package com.example.mainDb.repo;

import com.example.mainDb.domain.Text;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TextRepo extends CrudRepository<Text, String> {
    List <Text>findBytextIgnoreCaseContaining(String text);
}
