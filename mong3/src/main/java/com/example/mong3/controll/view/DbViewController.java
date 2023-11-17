package com.example.mong3.controll.view;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DbViewController {


    @GetMapping("/view")
    public String DBView(){

        return "Db_View";
    }
}
