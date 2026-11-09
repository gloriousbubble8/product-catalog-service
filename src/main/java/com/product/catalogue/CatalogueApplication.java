package com.product.catalogue;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
