package com.example.mvctries.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TryController.class)
public class TryControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void testExample() throws Exception {
		this.mvc.perform(
				post("/tryctrl")
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.accept(MediaType.APPLICATION_JSON_UTF8)
						.content("{\"nr11\":\"asd\",\"nr12\":1,\"level2\":{\"nr21\":2,\"nr22\":2}}"))
				.andExpect(status().isOk());
//				.andExpect(jsonPath("$.nr1").value(1));
	}
}
