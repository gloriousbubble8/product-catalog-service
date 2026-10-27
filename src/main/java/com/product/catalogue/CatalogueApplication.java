package com.product.catalogue;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.product.catalogue.audit.AuditService;

@SpringBootApplication
public class CatalogueApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(CatalogueApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner testAuditAutoConfiguration(AuditService auditService) {
//	    return args -> auditService.record(" ####### Auto-configuration verified #######");
//	}
	
//	@Bean
//	AuditService auditService() {
//		return new AuditService() {
//			@Override
//	        public void record(String action) {
//	            System.out.println("CUSTOM AUDIT: " + action);
//	        }
//		};
//	}
}
