package com.tsb.java.java11.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Actor {

    @Id
    String id;

    String name;
}
