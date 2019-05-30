package com.souza.evandir.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.souza.evandir.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
