package com.example.mvctries.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level2 implements Serializable {
	@Min(5)
	private Integer nr21;
	@Min(5)
	private Integer nr22;
}
