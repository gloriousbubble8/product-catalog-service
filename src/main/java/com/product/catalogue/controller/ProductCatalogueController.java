package com.product.catalogue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/products")
public class ProductCatalogueController {

    @GetMapping(path = "")
    public String getProductCatalogue() {
        return "Product Catalogue Demo api is up and running";
    }
}
