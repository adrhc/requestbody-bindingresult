package com.example.mvctries.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Level1 implements Serializable {
	private Integer nr1;
	private Level2 level2;
}
