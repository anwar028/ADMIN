package com.in.entity;

import jakarta.persistence.Entity;
import lombok.Data;

// Token 121
@Entity
@Data
public class Plan {
	
	private Integer planId;
	private String planName;
	private String planStatus;

	


}
