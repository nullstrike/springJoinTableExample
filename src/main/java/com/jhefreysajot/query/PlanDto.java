package com.jhefreysajot.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PlanDto {

    private String name;
    private String description;
    private String instructor;
    private Date startDate;
    private Date endDate;
    private Integer status;
}
