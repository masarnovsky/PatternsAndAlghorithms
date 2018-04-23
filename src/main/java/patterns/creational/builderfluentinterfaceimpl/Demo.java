package patterns.creational.builderfluentinterfaceimpl;

public class Demo {
    public static void main(String[] args) {
        String from = "Mom";
        String to = "Max";
        String subject = "vacation";
        String content = "we are fine!";

        EmailMessage email =
                EmailMessage.builder().to(to).from(from).subject(subject).content(content).build();
        System.out.println(email);

        EmailMessageV2 email2 =
                EmailMessageV2.from(from).to(to).subject(subject).content(content).mimeType("mime").build();
        System.out.println(email2);
    }
}
