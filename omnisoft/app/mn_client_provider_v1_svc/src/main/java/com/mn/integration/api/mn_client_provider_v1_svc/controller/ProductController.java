package com.mn.integration.api.mn_client_provider_v1_svc.controller;

import com.mn.integration.api.mn_client_provider_v1_svc.entity.Product;
import com.mn.integration.api.mn_client_provider_v1_svc.response.ProductResponse;
import com.mn.integration.api.mn_client_provider_v1_svc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ProductResponse saveProduct(@RequestBody Product product){
        ProductResponse productResponse = productService.saveProduct(product);
        return productResponse;
    }

}
