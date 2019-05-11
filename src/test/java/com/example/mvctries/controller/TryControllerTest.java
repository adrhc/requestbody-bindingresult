package com.example.mvctries.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MixBindingAndValidationErrorsController.class)
class TryControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	void testExample() throws Exception {
		this.mvc.perform(
				post("/errormixtest")
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.accept(MediaType.APPLICATION_JSON_UTF8)
//						.content("{\"nr11\":\"nr11\",\"nr12\":1,\"level2\":{\"nr21\":2,\"nr22\":\"nr22\"}}"))
						.content("{\"nr11\":\"x\",\"nr12\":1,\"level2\":{\"nr21\":\"xx\",\"nr22\":1,\"level3\":{\"nr31\":\"xxx\",\"nr32\":1}}}"))
				.andExpect(status().isOk());
//				.andExpect(jsonPath("$.nr1").value(1));
	}
}
