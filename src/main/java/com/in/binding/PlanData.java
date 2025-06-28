package com.in.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PlanData {
	
	private Integer planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Integer categoryId;

}
