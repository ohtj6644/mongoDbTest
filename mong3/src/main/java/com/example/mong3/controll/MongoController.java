package com.example.mong3.controll;


import com.example.mong3.Service.MongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MongoController {

    private final MongService mongService;



    public void testMong(){

        this.mongService.textCreate();
    }

}
