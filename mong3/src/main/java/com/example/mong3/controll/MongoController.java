package com.example.mong3.controll;


import com.example.mong3.Service.MongService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MongoController {

    private final MongService mongService;


@GetMapping("/api/test")
    public void testMong(){

        this.mongService.textCreate();
    }

}
