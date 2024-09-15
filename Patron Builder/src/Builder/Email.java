package Builder; // Asegúrate de que esté en el paquete correcto

import java.util.ArrayList;
import java.util.List;

public class Email {
    // Atributos obligatorios
    private final String subject;
    private final String body;
    private final List<String> recipients;

    // Constructor privado para ser invocado por el Builder
    private Email(EmailBuilder builder) {
        this.subject = builder.subject;
        this.body = builder.body;
        this.recipients = builder.recipients;
    }

    // Getters para acceder a los atributos
    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", recipients=" + recipients +
                '}';
    }

    // Clase interna estática Builder
    public static class EmailBuilder {
        // Atributos obligatorios
        private String subject;
        private String body;
        private List<String> recipients = new ArrayList<>();

        // Método para añadir destinatarios (permite múltiples)
        public EmailBuilder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }

        // Método para configurar el asunto
        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        // Método para configurar el cuerpo del correo
        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        // Método para construir la instancia de Email
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
