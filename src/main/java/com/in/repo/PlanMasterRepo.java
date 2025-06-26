package com.in.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.entity.PlanMasterEntity;

public interface PlanMasterRepo extends JpaRepository<PlanMasterEntity, Serializable> {

}
