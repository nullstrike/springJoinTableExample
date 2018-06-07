package com.jhefreysajot.query.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "plandetail")
public class PlanDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailId")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "moduleId")
    private Module modules;

    @ManyToOne
    @JoinColumn(name = "planId")
    private Plan plans;

    @Column(name = "startDate", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "endDate", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "instructor")
    private String instructor;

    @Column(name = "detailStatus", columnDefinition = "BIT")
    private Integer status;
}
