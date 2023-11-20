package com.example.mong3.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Document("1234_adress")
@AllArgsConstructor
@NoArgsConstructor
public class MongoAdress {

    @Id
    private String id;

    @DBRef
    private Mongo mongo;

    private String adress;

    private LocalDateTime insertDate;
}
