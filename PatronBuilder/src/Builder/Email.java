package Builder;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private final String subject;
    private final String body;
    private final List<String> recipients;
    private final List<String> attachments;

    private Email(EmailBuilder builder) {
        this.subject = builder.subject;
        this.body = builder.body;
        this.recipients = builder.recipients;
        this.attachments = builder.attachments;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Email{" +
                "Asunto:'" + subject + '\'' +
                "Cuerpo'" + body + '\'' +
                "Para:" + recipients +
                ", Archivos Adjuntos:" + attachments +
                '}';
    }

    public static class EmailBuilder {
        private String subject;
        private String body;
        private List<String> recipients = new ArrayList<>();
        private List<String> attachments = new ArrayList<>();

        public EmailBuilder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }

        public Email build() {
            if (recipients.isEmpty()) {
                throw new IllegalStateException("Debe tener al menos un destinatario");
            }
            if (subject == null || subject.isEmpty()) {
                throw new IllegalStateException("El asunto no puede estar vacío");
            }
            if (body == null || body.isEmpty()) {
                throw new IllegalStateException("El cuerpo no puede estar vacío");
            }
            return new Email(this);
        }
    }
}
