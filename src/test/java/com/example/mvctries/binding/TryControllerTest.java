package com.example.mvctries.binding;

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
						.content("{\"nr1\":\"asd\",\"level2\":{\"nr21\":21,\"nr22\":22}}"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nr1").value(1));
	}
}
