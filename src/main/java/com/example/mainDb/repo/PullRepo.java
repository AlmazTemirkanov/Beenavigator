package com.example.mainDb.repo;

import com.example.mainDb.domain.Pull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PullRepo extends CrudRepository <Pull, Integer> {
    List<Pull> findByNumber (Integer number);
}
