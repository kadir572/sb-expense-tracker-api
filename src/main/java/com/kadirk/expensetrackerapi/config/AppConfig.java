package com.kadirk.expensetrackerapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application-local.properties", ignoreResourceNotFound = true)
@PropertySource(value = "classpath:application-heroku.properties", ignoreResourceNotFound = true)
public class AppConfig {

}
