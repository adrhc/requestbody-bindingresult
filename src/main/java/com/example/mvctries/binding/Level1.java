package com.example.mvctries.binding;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Level1 implements Serializable {
	private int nr1;
	private Level2 level2;
}
