package com.example.mong3.Service;


import com.example.mong3.entity.Mongo;
import com.example.mong3.repo.MongoRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MongService {

    private final MongoRepo mongoRepo;



    public  void  textCreate(){
        for(int i=0; i<10 ; i++){

            Mongo mongo = new Mongo();
            mongo.setId(Integer.toString(i));
            mongo.setText1(i+"번째 테스트 데이터");
            mongo.setText2(i+"-2번째 테스트 데이터");


            this.mongoRepo.insert(mongo);
        }
    }


    public List<Mongo> getList() {
        try {
            return mongoRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace(); // 또는 로깅을 사용하여 예외 내용을 출력
            throw new RuntimeException("데이터를 가져오는 중에 오류가 발생했습니다.");
        }


    }

    public  Mongo getId(String id){

        try{
            return this.mongoRepo.findById(id).get();
        } catch (Exception e){
            e.printStackTrace();;
            throw new RuntimeException("가져오기 실패",e);
        }

    }


    public Mongo update(Mongo mongo , String text1 , String text2){
        mongo.setText1(text1);
        mongo.setText2(text2);
        this.mongoRepo.save(mongo);
        return mongo;
    }

    public void delete(String id){
        this.mongoRepo.delete(this.mongoRepo.findById(id).get());
    }
}
