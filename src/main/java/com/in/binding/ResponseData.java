package com.in.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ResponseData {
	
	private Integer planId;
	private String PlanName;
	private Integer categoryName;
	private LocalDate planStartDate;
	private LocalDate PlanEndDate;

}
