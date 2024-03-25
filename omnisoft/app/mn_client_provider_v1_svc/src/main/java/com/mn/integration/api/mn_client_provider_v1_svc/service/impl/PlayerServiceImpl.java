//package com.mn.integration.api.mn_client_provider_v1_svc.service.impl;
//
//
//import com.mn.integration.api.mn_client_provider_v1_svc.models.Name;
//import com.mn.integration.api.mn_client_provider_v1_svc.models.Players;
//import com.mn.integration.api.mn_client_provider_v1_svc.models.PlayersServiceRequest;
//import com.mn.integration.api.mn_client_provider_v1_svc.models.PlayersServiceResponse;
//
//import com.mn.integration.api.mn_client_provider_v1_svc.service.PlayersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class PlayerServiceImpl  {
//
//    @Autowired
//    PlayerRepo playerRepo;
//
//    @Override
//    public PlayersServiceResponse insertPlayers(PlayersServiceRequest playersServiceRequest) {
//
//        PlayersServiceResponse playersServiceResponse = playerRepo.save(playersServiceRequest);
//        return playersServiceResponse;
//    }
//
////    @Override
////    public PlayersServiceResponse save(PlayersServiceRequest playersServiceRequest) {
////        String name = playersServiceRequest.getName();
////        Integer age = playersServiceRequest.getAge();
////        String team = playersServiceRequest.getTeam();
////        Boolean status = true;
////        String query = "INSERT INTO customer_data(name,age,team,status) value(?,?,??,)";
////        PlayersServiceResponse playersServiceResponse = new PlayersServiceResponse();
////        playersServiceResponse.setStatus("insert success");
////        jdbcTemplate.execute(query);
////        System.out.println("in repository");
////        return playersServiceResponse;
////    }
//
//
//    @Override
//    public PlayersServiceResponse getPlayers(PlayersServiceRequest playersServiceRequest) {
//        return null;
//    }
//
//
//}
