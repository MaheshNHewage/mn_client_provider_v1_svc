package com.mn.integration.api.mn_client_provider_v1_svc.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String firstName;
    private String lastName;
}
