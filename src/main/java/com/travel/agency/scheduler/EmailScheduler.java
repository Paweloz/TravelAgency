package com.travel.agency.scheduler;

import com.travel.agency.config.AdminConfig;
import com.travel.agency.domain.MailBulider.Mail;
import com.travel.agency.repository.AppProblemDao;
import com.travel.agency.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailScheduler {

    private final MailService mailService;
    private final AppProblemDao appProblemDao;
    private final AdminConfig adminConfig;

    @Scheduled(cron = "0 0 0 10 * *")
    public void notifyProblemsToAdmin() {
        mailService.send(new Mail.MailBuilder()
                        .receiverEmail(adminConfig.getAdminMail())
                        .subject("Current App Problem status")
                        .message(buildMessage())
                        .build()
                );
    }

    private String buildMessage() {
        return "Currently your app has : " + appProblemDao.count() + " problems in DB";
    }
}
