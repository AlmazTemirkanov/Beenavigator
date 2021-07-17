package com.example.mainDb.repo;

import com.example.mainDb.domain.CRMPost;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CRMPostRepo extends CrudRepository <CRMPost, Integer> {
    List<CRMPost> findBySrIgnoreCaseContaining (String date);
    List<CRMPost> findAllById (Integer id);
}
