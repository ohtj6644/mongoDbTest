package com.example.mong3.Service;


import com.example.mong3.entity.Mongo;
import com.example.mong3.repo.MongoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MongService {

    private final MongoRepo mongoRepo;


    public  void  textCreate(){


        for(int i=0; i<10 ; i++){

            Mongo mongo = new Mongo(i+"",i+"번째 테스트 데이터",i+"-2 번째 테스트 데이터");
            this.mongoRepo.insert(mongo);
        }
    }



}
