package com.mn.integration.api.mn_client_provider_v1_svc.entity;

import com.mn.integration.api.mn_client_provider_v1_svc.response.ProductResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")
public class Product  {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private double price;
}
