package com.mn.integration.api.mn_client_provider_v1_svc.repository;

import com.mn.integration.api.mn_client_provider_v1_svc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
