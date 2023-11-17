package com.example.mong3.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("1234")
public class Mongo {

    @Id
    private String id;

    private String text1;
    private String text2;



    public Mongo(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public Mongo(String id, String text1, String text2){
        this.text1=text1;
        this.text2=text2;
        this.id=id;

    }
}
