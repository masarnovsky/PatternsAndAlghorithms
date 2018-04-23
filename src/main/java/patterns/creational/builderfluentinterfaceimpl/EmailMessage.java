package patterns.creational.builderfluentinterfaceimpl;

public class EmailMessage {
    private String from;
    private String to;
    private String subject;
    private String content;
    private String mimeType;

    public EmailMessage() {
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

    public static Builder builder() {
        return new EmailMessage.Builder();
    }

    public static class Builder {
        private final EmailMessage instance = new EmailMessage();

        public Builder() {
        }

        public Builder from(String from) {
            instance.from = from;
            return this;
        }

        public Builder to(String to) {
            instance.to = to;
            return this;
        }

        public Builder subject(String subject) {
            instance.subject = subject;
            return this;
        }

        public Builder content(String content) {
            instance.content = content;
            return this;
        }

        public Builder mimeType(String mimeType) {
            instance.mimeType = mimeType;
            return this;
        }

        public EmailMessage build() {
            assert instance.from != null;
            assert instance.to != null;
            assert instance.subject != null;
            assert instance.content != null;

            return instance;
        }
    }
}