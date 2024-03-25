//package com.mn.integration.api.mn_client_provider_v1_svc.controller;
//
//import com.mn.integration.api.mn_client_provider_v1_svc.dtos.Name;
//import com.mn.integration.api.mn_client_provider_v1_svc.models.PlayersServiceRequest;
//import com.mn.integration.api.mn_client_provider_v1_svc.models.PlayersServiceResponse;
//import com.mn.integration.api.mn_client_provider_v1_svc.repository.UserRepository;
//import com.mn.integration.api.mn_client_provider_v1_svc.service.PlayersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.Serializable;
//
//@RestController
//@RequestMapping("v1/")
//public class CricketController implements Serializable {
//
//
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/insert")
//
//    public PlayersServiceResponse insertData(@RequestBody PlayersServiceRequest playersServiceRequest) {
//        return userRepository.save(playersServiceRequest);
//    }
//
//    public @ResponseBody Iterable<Name> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return userRepository.findAll();
//    }
//}
