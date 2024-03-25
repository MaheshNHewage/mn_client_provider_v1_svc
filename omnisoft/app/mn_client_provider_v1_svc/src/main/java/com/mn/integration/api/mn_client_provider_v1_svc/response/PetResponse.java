package com.mn.integration.api.mn_client_provider_v1_svc.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mn.integration.api.mn_client_provider_v1_svc.models.Category;
import com.mn.integration.api.mn_client_provider_v1_svc.models.PetStatus;
import com.mn.integration.api.mn_client_provider_v1_svc.models.Tags;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class PetResponse {

        private static final long serialVersionUID = 1L;

        private long id;
        private Category category;
        private String name;
        private List<String> photoUrls;
        private List<Tags> tags;
        private PetStatus status;

}
