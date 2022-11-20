package com.ProjectActivity.importerSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ImporterSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImporterSiteApplication.class, args);
	}
}
