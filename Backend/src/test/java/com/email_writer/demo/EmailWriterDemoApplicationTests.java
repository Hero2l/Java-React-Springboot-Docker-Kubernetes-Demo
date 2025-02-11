package com.email_writer.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Enables Mockito
public class EmailWriterDemoApplicationTests {

	@Mock
	private EmailGeneratorService emailGeneratorService;

	@InjectMocks
	private EmailGeneratorController emailGeneratorController;

	@Test
	void contextLoads() {
		EmailRequest mockRequest = new EmailRequest();
		mockRequest.setEmailContent("Test email content");
		mockRequest.setTone("Professional");

		when(emailGeneratorService.generateEmailReply(mockRequest))
				.thenReturn("Mock Email Response");

		// Optional: You can now call your controller method if needed
		String response = emailGeneratorService.generateEmailReply(mockRequest);
		System.out.println(response); // Should print "Mock Email Response"
	}
}
