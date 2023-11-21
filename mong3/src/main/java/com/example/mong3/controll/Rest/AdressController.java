package com.example.mong3.controll.Rest;


import com.example.mong3.Service.AdressService;
import com.example.mong3.Service.MongService;
import com.example.mong3.entity.Mongo;
import com.example.mong3.entity.MongoAdress;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AdressController {

    private final MongService mongService;
    private final AdressService adressService;


    @PostMapping("/adress/{id}")
    public String CreateAdress(@PathVariable String id , @RequestParam(value = "adress")String adress){
        Mongo mongo = this.mongService.getId(id);
        MongoAdress mongoAdress=this.adressService.createAdress(mongo,adress);
        return mongoAdress.getMongo().getId()+"번 몽고의 주소로"+mongoAdress.getAdress()+" 가 등록되었습니다";

    }

    @DeleteMapping("/adress/delete/{id}")
    public String deleteAdress(@PathVariable String id){
        this.adressService.delete(id);
        return id+"번 adress 가 삭제되었습니다 ";
    }

    @PostMapping("/adress/update/{id}")
    public String adressUpdate(@PathVariable String id , @RequestParam(value = "newAdress")String adress){
        String lastAdress = this.adressService.getAdress(id);
        MongoAdress mongoAdress=this.adressService.updateAdress(id,adress);

        return id+"번  이전 adress: "+lastAdress+"+가 "+ mongoAdress.getAdress()+" 로 수정되었습니다";
    }

}
