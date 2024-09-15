package Builder;

public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .addRecipient("ingecarloshernandez@umg.edu.com")
                .setSubject("Entrega de tarea\n")
                .setBody("Buenas noches, esta es la tarea sobre Builder\n")
                .addAttachment("Builder.pdf")
                .build();

        System.out.println(email);
    }
}