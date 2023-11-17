package com.example.mong3.repo;

import com.example.mong3.entity.Mongo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MongoRepo extends MongoRepository<Mongo , String> {
    public List<Mongo> findByText1(String Text1);


    public Page<Mongo>findAll(Pageable pageable);
}
