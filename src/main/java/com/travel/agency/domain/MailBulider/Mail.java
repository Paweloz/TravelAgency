package com.travel.agency.domain.MailBulider;

import lombok.Getter;

@Getter
public class Mail {
    private final String receiverEmail;
    private final String subject;
    private final String message;
    private final String toCc;
    private final String goodbye_message;

    public static class MailBuilder {
        private String receiverEmail;
        private String subject;
        private String message;
        private String toCc;
        private String goodbye_message;

        public MailBuilder receiverEmail(String receiverEmail) {
            this.receiverEmail = receiverEmail;
            return this;
        }

        public MailBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public MailBuilder message(String message) {
            this.message = message;
            return this;
        }

        public MailBuilder toCc(String toCc) {
            this.toCc = toCc;
            return this;
        }

        public MailBuilder goodbye_message(String goodbye_message) {
            this.goodbye_message = goodbye_message;
            return this;
        }

        public Mail build() {
            return new Mail(receiverEmail, subject, message, toCc, goodbye_message);
        }
    }

    public Mail(String receiverEmail, String subject, String message, String toCc, String goodbye_message) {
        this.receiverEmail = receiverEmail;
        this.subject = subject;
        this.message = message;
        this.toCc = toCc;
        this.goodbye_message = goodbye_message;
    }
}
