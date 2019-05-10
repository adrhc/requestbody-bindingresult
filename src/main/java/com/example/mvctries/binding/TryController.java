package com.example.mvctries.binding;

import com.example.mvctries.web.BindingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * http://localhost:8082/tryctrl
 */
@RestController
@RequestMapping("/tryctrl")
@Slf4j
public class TryController {
	@Autowired
	private BindingHandler bindingHandler;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Level1 post(@RequestBody Level1 level1, BindingResult errors) {
		log.debug("level1:\n{}", level1);
		// {"nr1":1,"level2":{"nr21":21,"nr22":22}}
		return level1;
	}
}
