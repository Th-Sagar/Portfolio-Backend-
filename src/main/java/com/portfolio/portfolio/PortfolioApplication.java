package com.portfolio.portfolio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();
		System.setProperty("PORT", dotenv.get("PORT"));
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_DATABASE", dotenv.get("DB_DATABASE"));
		System.setProperty("DB_INDEX", dotenv.get("DB_INDEX"));


		SpringApplication.run(PortfolioApplication.class, args);
	}

}
