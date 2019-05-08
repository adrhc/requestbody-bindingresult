package com.example.mvctries.binding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tryctrl")
@Slf4j
public class TryController {
	@ResponseStatus(HttpStatus.OK)
	public void post(@RequestBody Level1 level1) {
		log.debug("level1:\n{}", level1);
	}
}
