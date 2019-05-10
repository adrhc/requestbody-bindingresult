package com.example.mvctries.controller;

import com.example.mvctries.json.deserializer.CustomIntegerDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Level2 implements Serializable {
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr21;
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr22;
	@Valid
	private Level3 level3;
}
