package com.jhefreysajot.query;

import com.jhefreysajot.query.model.PlanDetail;
import com.jhefreysajot.query.repository.PlanDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {

    @Autowired
    private PlanDetailRepository planDetailRepository;

    @GetMapping("/")
    public List<PlanDetail> getPlan(){
        return planDetailRepository.findAllBy();
    }
}
