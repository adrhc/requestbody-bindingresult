package com.example.mvctries.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * http://localhost:8082/tryctrl
 */
@RestController
@RequestMapping("/tryctrl")
@Slf4j
public class TryController {
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Level1 post(@Valid @RequestBody Level1 level1, BindingResult errors) {
		log.debug("level1:\n{}", level1);
		log.debug("errors:\n{}", errors);
		// {"nr11":"nr11","nr12":1,"level2":{"nr21":"nr21","nr22":1,"level3":{"nr31":"nr31","nr32":1}}}
		return level1;
	}
}
