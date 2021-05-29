package com.example.restservice.modules.seguridad;

import com.example.restservice.shared.config.ApplicationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeguridadController {

	@Autowired
	private ApplicationProperties properties;

	@GetMapping("/login")
	public String greeting() {
		return properties.getName();
	}
}
