package com.example.mainDb.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
public class Pull {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private String number;

    @Column(name = "topic")
    private String topic;

    @Column(name = "date_on")
    private String date_on;

    @Column(name = "date_off")
    private String date_off;

    @Column(name = "comments")
    private String comments;

}
