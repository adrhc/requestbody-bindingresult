package com.example.mvctries.binding;

import com.example.mvctries.json.deserializer.CustomIntegerDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level1 implements Serializable {
	@JsonDeserialize(using = CustomIntegerDeserializer.class)
	private Integer nr1;
	private Level2 level2;
}
