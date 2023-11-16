package com.example.mong3.repo;

import com.example.mong3.entity.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MongoRepo extends MongoRepository<Mongo , String> {
}
