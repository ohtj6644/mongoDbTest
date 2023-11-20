package com.example.mong3.repo;

import com.example.mong3.entity.MongoAdress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdressRepo extends MongoRepository<MongoAdress , String> {


    MongoAdress findTopByOrderByIdDesc();

    MongoAdress findTopByOrderByInsertDateDesc();
}
