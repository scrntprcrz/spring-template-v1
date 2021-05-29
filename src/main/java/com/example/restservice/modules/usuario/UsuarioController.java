package com.example.restservice.modules.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	@GetMapping("/usuario")
	public String greeting() {
		return "usuario";
	}
}
