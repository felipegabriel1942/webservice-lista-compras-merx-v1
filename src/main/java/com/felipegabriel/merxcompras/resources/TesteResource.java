package com.felipegabriel.merxcompras.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class TesteResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> buscar() {
		return ResponseEntity.ok("TESTOU");
	}
}
