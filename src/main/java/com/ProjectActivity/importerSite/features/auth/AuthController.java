package com.ProjectActivity.importerSite.features.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(exposedHeaders = { "Access-Control-Allow-Origin" }, allowCredentials = "true", originPatterns = "*")
@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

	@GetMapping("profile")
	public Object getProfile() {
		return null;
	}
}
