package com.erezende.envioemail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.erezende.envioemail.services.EmailService;
import com.erezende.envioemail.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	/*
	 * Para o perfil test eu vou implementar a interface EmailService com a classe
	 * MockEmailService não precisa enviar o e-mail de verdade
	 */

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
