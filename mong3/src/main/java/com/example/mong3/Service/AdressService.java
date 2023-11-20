package com.example.mong3.Service;

import com.example.mong3.entity.Mongo;
import com.example.mong3.entity.MongoAdress;
import com.example.mong3.repo.AdressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdressService {


    private final AdressRepo adressRepo;


    public MongoAdress createAdress(Mongo mongo, String adress){
        MongoAdress mongoAdress = new MongoAdress();

        mongoAdress.setId(Integer.toString(Integer.parseInt(this.adressRepo.findTopByOrderByIdDesc().getId())+1));
        mongoAdress.setMongo(mongo);
        mongoAdress.setAdress(adress);
        this.adressRepo.insert(mongoAdress);

        return mongoAdress;

    }

    public void delete(String id){

        this.adressRepo.deleteById(id);
    }
}
