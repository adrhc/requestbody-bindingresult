package com.example.mvctries.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * A simple classic @Controller used for testing the solution.
 */
@RestController
@RequestMapping("/errormixtest")
@Slf4j
public class MixBindingAndValidationErrorsController {
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Level1 post(@Valid @RequestBody Level1 level1, BindingResult errors) {
		log.debug("level1:\n{}", level1);
		log.debug("errors:\n{}", errors);
		// {"nr11":"x","nr12":1,"level2":{"nr21":"xx","nr22":1,"level3":{"nr31":"xxx","nr32":1}}}
		return level1;
	}
}
