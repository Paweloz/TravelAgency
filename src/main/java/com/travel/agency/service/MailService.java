package com.travel.agency.service;

import com.travel.agency.domain.Mail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender javaMailSender;
    private final AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process email sending ";

    public void send(Mail mail) {
        try {
            SimpleMailMessage simpleMailMessage = createMailMessage(mail);
            javaMailSender.send(simpleMailMessage);
            log.info("Email has been sent");
        } catch (MailException e) {
            log.warn(PROBLEM + e.getMessage());
            appProblemService.saveProblem(PROBLEM + e.getMessage());
        }
    }

    private SimpleMailMessage createMailMessage(Mail mail){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(mail.getReceiverEmail());
        mailMessage.setSubject(mail.getSubject());
        mailMessage.setText(mail.getMessage());
        return mailMessage;
    }
}
