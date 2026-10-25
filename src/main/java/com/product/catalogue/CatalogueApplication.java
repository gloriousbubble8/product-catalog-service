package com.product.catalogue;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogueApplication {
	public static void main(String[] args) throws IOException {
		
		ClassLoader loader =
	            CatalogueApplication.class.getClassLoader();

	    String resource =
	            "META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports";

	    Enumeration<URL> resources =
	            loader.getResources(resource);

	    while (resources.hasMoreElements()) {
	        System.out.println(resources.nextElement());
	    }

		
		SpringApplication.run(CatalogueApplication.class, args);
	}
}
