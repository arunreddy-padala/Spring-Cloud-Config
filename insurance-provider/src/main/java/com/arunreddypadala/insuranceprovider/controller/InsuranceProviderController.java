package com.arunreddypadala.insuranceprovider.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/insurance-provider")
public class InsuranceProviderController {


  @GetMapping("v2/getUpdatedPlan")
  public List<String> getAllPlans() {

      return Stream.of("Platinum", "Gold", "Silver", "Ruby").collect(Collectors.toList());

  }



}
