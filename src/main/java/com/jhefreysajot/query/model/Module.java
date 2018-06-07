package com.jhefreysajot.query.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name =  "module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moduleId")
    private Integer id;

    @Column(name = "moduleName")
    private String name;

    @Column(name = "moduleDescription", columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "modules")
    private Set<PlanDetail> moduleDetails;
}
