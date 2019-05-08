package com.example.mvctries.binding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tryctrl")
@Slf4j
public class TryController {
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Level1 post(@RequestBody Level1 level1) {
		log.debug("level1:\n{}", level1);
		return level1;
	}
}
