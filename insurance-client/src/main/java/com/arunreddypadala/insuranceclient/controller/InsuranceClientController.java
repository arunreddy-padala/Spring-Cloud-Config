package com.arunreddypadala.insuranceclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/insurance-client")
@RequiredArgsConstructor
public class InsuranceClientController {


  @Autowired
  private final RestTemplate restTemplate;

  @Value("${insurance.provider.url}")
  private String url;

  @GetMapping("/getPlans")
  public List<String> getPlans() {

    List<String> plans = restTemplate.getForObject(url,List.class);
    return plans;

  }


}
