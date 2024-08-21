package com.mn.integration.api.mn_client_provider_v1_svc.service;


import com.mn.integration.api.mn_client_provider_v1_svc.response.PetResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PetRestClient {

    private RestClient restClient;

    public  PetRestClient(){
        restClient = RestClient.builder()
                .baseUrl("https://petstore.swagger.io")
                .build();
    }

    public List<PetResponse> getPet() {
        return restClient.get()
                .uri("v2/pet/findByStatus?status=pending")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(new ParameterizedTypeReference<List<PetResponse>>() {
                });
    }

}
