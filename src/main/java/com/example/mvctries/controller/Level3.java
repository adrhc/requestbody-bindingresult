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
class Level3 implements Serializable {
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr31;
	@Min(5)
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr32;
}
