package com.erezende.envioemail.services;

import com.erezende.envioemail.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
