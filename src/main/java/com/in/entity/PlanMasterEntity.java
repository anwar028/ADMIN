package com.in.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="PLAN_MASTER")
@Data
public class PlanMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer planId;
	private String PlanName;
	private Character ActiveSw;
	private Integer CatogoryId;
	private LocalDate planStartDate;
	private LocalDate PlanEndDate;
	
	private String createdBy;
	private String updatedBy;
	
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
}
