package org.dnyanyog;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.dnyanyog")
public class CandidateServiceMain {
  public static void main(String args[]) {
    SpringApplication.run(CandidateServiceMain.class, args);
  }
}
