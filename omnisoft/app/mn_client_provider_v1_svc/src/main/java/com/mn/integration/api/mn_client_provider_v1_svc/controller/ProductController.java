package com.mn.integration.api.mn_client_provider_v1_svc.controller;

import com.mn.integration.api.mn_client_provider_v1_svc.entity.Product;
import com.mn.integration.api.mn_client_provider_v1_svc.response.ProductResponse;
import com.mn.integration.api.mn_client_provider_v1_svc.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

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

    @PutMapping("/updateProduct/{id}")
    public ProductResponse updateProduct(@PathVariable int id , @RequestBody Product product){
        ProductResponse productResponse = productService.updateProduct(product,id);
        return productResponse;
    }


    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
      String s =   productService.deleteProduct(id);
      return  s;
    }

    @GetMapping("/getAllProduct")
    public List<Product> getProduct(){
        List<Product> listP=  productService.getProduct();
        return listP;
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        Optional<Product> productById=  productService.getProductById(id);
        return productById;
    }


    @GetMapping(value = "/getProductCount", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getProductCount(){
      //  long productCount=  productService.getProductCount();
      //  return productCount;
        return 0;
    }
}
