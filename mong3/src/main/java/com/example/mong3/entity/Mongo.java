package com.example.mong3.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("1234")
@NoArgsConstructor
@AllArgsConstructor
public class Mongo {

    @Id
    private String id;

    private String text;

}
