package com.mn.integration.api.mn_client_provider_v1_svc.service;

import com.mn.integration.api.mn_client_provider_v1_svc.entity.Product;
import com.mn.integration.api.mn_client_provider_v1_svc.repository.ProductRepository;
import com.mn.integration.api.mn_client_provider_v1_svc.response.PetResponse;
import com.mn.integration.api.mn_client_provider_v1_svc.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.LinkedHashMap;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PetRestClient petRestClient;

    private RestClient restClient;

    public ProductResponse saveProduct(Product product){
        ProductResponse response = new ProductResponse();
        List<PetResponse>  petResponse =  petRestClient.getPet();
        replaceName(petResponse,product);

        Product product1 = productRepository.save(product);
        if (product1 != null) {
            response.setId(product1.getId());
            response.setMessage("Product successfully saved");
        } else {
             response = new ProductResponse();
            response.setMessage("Product error");
        }
       return response;
    }

   public void replaceName(List<PetResponse> petData, Product product){

       product.setName(petData.get(0).getName());
    }

    public void secured(List<PetResponse> petData, Product product){

        product.setName(petData.get(0).getName());
    }




}
