package com.in.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.entity.PlanCatogoryEntity;

public interface PlanCategoryRepo extends JpaRepository<PlanCatogoryEntity, Serializable> {

}
