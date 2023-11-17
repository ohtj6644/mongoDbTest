package com.example.mong3.controll.view;


import com.example.mong3.Service.MongService;
import com.example.mong3.controll.MongoController;
import com.example.mong3.entity.Mongo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DbViewController {

    private  final  MongoController mongoController;
    private final MongService mongService;

//
}
