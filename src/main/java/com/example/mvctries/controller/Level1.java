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
class Level1 implements Serializable {
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr11;
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr12;
	@Valid
	private Level2 level2;
}
