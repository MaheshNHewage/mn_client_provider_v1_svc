package com.mn.integration.api.mn_client_provider_v1_svc.service;

import com.mn.integration.api.mn_client_provider_v1_svc.entity.Product;
import com.mn.integration.api.mn_client_provider_v1_svc.repository.ProductRepository;
import com.mn.integration.api.mn_client_provider_v1_svc.response.PetResponse;
import com.mn.integration.api.mn_client_provider_v1_svc.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PetRestClient petRestClient;


    public ProductResponse saveProduct(Product product) {
        ProductResponse response = new ProductResponse();
        List<PetResponse> petResponse = petRestClient.getPet();
        replaceName(petResponse, product);
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

    public ProductResponse updateProduct(Product reqProduct, int id) {
        Product p = new Product();
        p.setQty(reqProduct.getQty());
        p.setName(reqProduct.getName());
        p.setPrice(reqProduct.getPrice());
        p.setId(id);
        ProductResponse response = new ProductResponse();
        Optional<Product> productById = productRepository.findById(id);
        Product product1 = null;
        if (!productById.isEmpty()) {
            product1 = productRepository.save(p);
            response.setId(product1.getId());
            response.setMessage("Product successfully updated ");
        }
       else {
            response = new ProductResponse();
            response.setId(id);
            response.setMessage("id not found error");
        }
        return response;
    }

    public String deleteProduct(int ids) {
       productRepository.deleteById(ids);
        return "deleted";
    }

    public List<Product> getProduct() {
      List<Product>  list=  productRepository.findAll();
        return list;
    }

    public Optional<Product> getProductById(int id) {
     // int s = id+1;
        Optional<Product> productById = productRepository.findById(id );
        return  productById;
    }


    private void replaceName(List<PetResponse> petData, Product product) {
        product.setName(product.getName() + " " + petData.get(0).getName());
    }




}
