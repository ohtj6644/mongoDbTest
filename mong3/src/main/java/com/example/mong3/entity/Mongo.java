package com.example.mong3.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("1234")
@AllArgsConstructor
@NoArgsConstructor
public class Mongo {

    @Id
    private String id;

    private String text1;
    private String text2;


}
