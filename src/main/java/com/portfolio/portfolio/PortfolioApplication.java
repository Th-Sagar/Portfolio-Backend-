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

		System.setProperty("SMTP_HOST", dotenv.get("SMTP_HOST"));
		System.setProperty("SMTP_PORT", dotenv.get("SMTP_PORT"));
		System.setProperty("SMTP_MAIL", dotenv.get("SMTP_MAIL"));
		System.setProperty("SMTP_PASSWORD", dotenv.get("SMTP_PASSWORD"));
		System.setProperty("SMTP_AUTH", dotenv.get("SMTP_AUTH"));
		System.setProperty("SMTP_ENABLE", dotenv.get("SMTP_ENABLE"));

		SpringApplication.run(PortfolioApplication.class, args);
	}

}
