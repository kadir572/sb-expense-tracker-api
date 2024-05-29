package com.kadirk.expensetrackerapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  // @Value("${spring.application.name}")
  // private String applicationName;

  @GetMapping
  public String getAll() {
    try {
      jdbcTemplate.queryForObject("SELECT 1", Integer.class);
      return "Database connection is successful";
    } catch (Exception e) {
      return "Database connection failed: " + e.getMessage();
    }
    // System.out.println(applicationName);
    // return new String("All Expenses");
  }
}
