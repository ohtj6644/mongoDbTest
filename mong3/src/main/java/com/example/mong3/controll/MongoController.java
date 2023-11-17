package com.example.mong3.controll;


import com.example.mong3.Service.MongService;
import com.example.mong3.entity.Mongo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Mongo> List(){
        return this.mongService.getList();
    }
}
