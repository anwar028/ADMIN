package com.in.entity;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="PLAN_CATEGORY")
@Data
public class PlanCatogoryEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer catogoryId;
	private String catogoryName;
	private String activeSW;
	
	private String cretatedBy;
	private String updatedBy;

	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	


}
