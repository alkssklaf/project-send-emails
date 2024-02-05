package com.project.sendemails;

import com.project.sendemails.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SendEmailsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SendEmailsApplication.class, args);

        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.sendEmail();
    }

}
