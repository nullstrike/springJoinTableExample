package com.jhefreysajot.query.repository;

import com.jhefreysajot.query.model.PlanDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanDetailRepository extends JpaRepository<PlanDetail, Integer> {

    @Query(" select new com.jhefreysajot.query.PlanDto(b.name, b.description, a.instructor, a.startDate, a.endDate, a.status) from PlanDetail a join a.modules b join a.plans c ")
    List<PlanDetail> findAllBy();
}
