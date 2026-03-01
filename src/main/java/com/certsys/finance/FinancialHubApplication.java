package com.certsys.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// O parâmetro 'exclude' manda o Spring ignorar o banco de dados temporariamente
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FinancialHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinancialHubApplication.class, args);
        System.out.println("🚀 Financial Hub iniciado na porta 8080! Pronto para transações.");
    }
}