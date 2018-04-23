package patterns.creational.builderfluentinterfaceimpl;

public class EmailMessageV2 {
    private String from;
    private String to;
    private String subject;
    private String content;
    private String mimeType;

    public EmailMessageV2() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmailMessage:");
        sb.append(" from:'").append(from).append('\'');
        sb.append(" to:'").append(to).append('\'');
        sb.append(" subject:'").append(subject).append('\'');
        sb.append(" content:'").append(content).append('\'');
        sb.append('\n');
        return sb.toString();
    }

    public static To from(String from) {
        return new EmailMessageV2.Builder(from);
    }

    public interface To {
        Subject to(String to);
    }

    public interface Subject {
        Content subject(String subject);
    }

    public interface Content {
        Build content(String content);
    }

    public interface Build {
        Build mimeType(String mimeType);

        EmailMessageV2 build();
    }

    public static class Builder implements To, Subject, Content, Build {
        private final EmailMessageV2 instance = new EmailMessageV2();

        public Builder(String from) {
            instance.from = from;
        }

        @Override
        public Subject to(String to) {
            instance.to = to;
            return this;
        }

        @Override
        public Content subject(String subject) {
            instance.subject = subject;
            return this;
        }

        @Override
        public Build content(String content) {
            instance.content = content;
            return this;
        }

        @Override
        public Build mimeType(String mimeType) {
            instance.mimeType = mimeType;
            return this;
        }

        @Override
        public EmailMessageV2 build() {
            return instance;
        }
    }
}