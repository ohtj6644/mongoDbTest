package com.example.mong3.Service;

import com.example.mong3.entity.Mongo;
import com.example.mong3.entity.MongoAdress;
import com.example.mong3.repo.AdressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AdressService {


    private final AdressRepo adressRepo;


    public MongoAdress createAdress(Mongo mongo, String adress){
        MongoAdress mongoAdress = new MongoAdress();

        if(this.adressRepo.findTopByOrderByInsertDateDesc()==null){
            mongoAdress.setId("000000");
        }else {
            mongoAdress.setId(String.format("%06d",Integer.parseInt(this.adressRepo.findTopByOrderByInsertDateDesc().getId())+1));
        }

        mongoAdress.setMongo(mongo);
        mongoAdress.setAdress(adress);
        mongoAdress.setInsertDate(LocalDateTime.now());
        this.adressRepo.insert(mongoAdress);

        return mongoAdress;

    }

    public void delete(String id){

        this.adressRepo.deleteById(id);
    }
}
