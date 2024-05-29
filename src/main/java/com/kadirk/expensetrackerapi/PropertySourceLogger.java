package com.kadirk.expensetrackerapi;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceLogger implements ApplicationListener<ApplicationReadyEvent> {

  private final Environment environment;

  public PropertySourceLogger(Environment environment) {
    this.environment = environment;
  }

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    ConfigurableEnvironment env = (ConfigurableEnvironment) environment;
    env.getPropertySources().forEach(propertyResource -> {
      System.out.println("PropertySource: " + propertyResource.getName());
    });
  }
}
