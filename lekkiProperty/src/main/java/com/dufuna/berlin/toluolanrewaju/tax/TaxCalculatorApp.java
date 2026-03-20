package com.dufuna.berlin.toluolanrewaju.tax;

import com.dufuna.berlin.toluolanrewaju.tax.model.TaxBracket;
import com.dufuna.berlin.toluolanrewaju.tax.repository.TaxBracketRepository;
import com.dufuna.berlin.toluolanrewaju.tax.service.TaxCalculatorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class TaxCalculatorApp {
    public static void main(String[] args) {
        SpringApplication.run(TaxCalculatorApp.class, args);
        System.out.println("Tax Calculator App is running...");
    }

  @Bean
  CommandLineRunner runner (TaxBracketRepository  repository, TaxCalculatorService service) {
      return args -> {


          /*  Store tax brackets (this is your "Excel table")*/
          repository.save(new TaxBracket(0, 30000, 0.05));
          repository.save(new TaxBracket(30000, 100000, 0.1));
          repository.save(new TaxBracket(100000, 250000, 0.15));
          repository.save(new TaxBracket(250000, Double.MAX_VALUE, 0.2));

      };
  }
}
