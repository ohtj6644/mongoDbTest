package com.example.mong3.controll;


import com.example.mong3.Service.MongService;
import com.example.mong3.entity.Mongo;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MongoController {

    private final MongService mongService;

    @GetMapping("/api/test")
    public String testMong(){

        this.mongService.textCreate();

        return "테스트데이터 삽입 성공!";
    }


    @GetMapping("/readData")
    public List<Mongo> findAll(){
        return this.mongService.getList();
    }

    @GetMapping("/readData/{id}")
    public String readMongo(@PathVariable String id ){
        return this.mongService.getId(id).getText1();
    }
}
