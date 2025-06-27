package com.in.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.entity.PlanCategoryEntity;





public interface PlanCategoryRepo extends JpaRepository<PlanCategoryEntity, Serializable> {

}
