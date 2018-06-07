package com.jhefreysajot.query.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planId")
    private Integer id;

    @Column(name = "planName")
    private String name;

    @Column(name = "planDescription" , columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "plans")
    private Set<PlanDetail> planDetails;
}
