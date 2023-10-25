package com.erezende.envioemail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.erezende.envioemail.services.EmailService;
import com.erezende.envioemail.services.SendGridEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	/*
	 * Para o perfil dev eu vou implementar a interface EmailService com a classe
	 * SendGridEmailService
	 */

	@Bean
	public EmailService emailService() {
		return new SendGridEmailService();
	}
}
