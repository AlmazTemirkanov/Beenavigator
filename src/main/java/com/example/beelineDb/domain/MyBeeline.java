package com.example.beelineDb.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Getter
@Setter
//@Table(name = "mybeeline")
 @Table(name = "mv_my_beeline_actv", schema = "ivr_triggers")
public class MyBeeline {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "actv_date_time")
    private LocalDate actv_date_time;

}
