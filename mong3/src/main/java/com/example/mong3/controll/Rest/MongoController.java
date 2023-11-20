package com.example.mong3.controll.Rest;


import com.example.mong3.Service.MongService;
import com.example.mong3.entity.Mongo;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/update/{id}")
    public Mongo update(@PathVariable String id , @RequestParam(value = "text1")String text1 ,@RequestParam(value = "text2")String text2  ){
        Mongo mongo = this.mongService.getId(id);
        Mongo updateMongo=this.mongService.update(mongo,text1,text2);
        return updateMongo;
    }

    //delete 맵핑은 http 요청이 DELETE 방식으로 왔을 경우에만 실행됨.
    @DeleteMapping("/{id}/delete")
    public void Delete(@PathVariable String id){
        this.mongService.delete(id);

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        this.mongService.delete(id);
        return id+"번이 삭제되었습니다";
    }


}
