package com.kadirk.expensetrackerapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

  @Value("${spring.application.name}")
  private String applicationName;

  @GetMapping
  public String getAll() {
    System.out.println(applicationName);
    return new String("All Expenses");
  }
}
