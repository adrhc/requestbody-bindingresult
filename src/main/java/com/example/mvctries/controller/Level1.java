package com.example.mvctries.controller;

import com.example.mvctries.json.deserializer.CustomIntegerDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level1 implements Serializable {
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr11;
	@Min(5)
	private Integer nr12;
	private Level2 level2;
}