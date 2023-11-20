package com.example.mong3.controll.view;


import com.example.mong3.Service.MongService;
import com.example.mong3.controll.Rest.MongoController;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DbViewController {

    private  final  MongoController mongoController;
    private final MongService mongService;

//
}
