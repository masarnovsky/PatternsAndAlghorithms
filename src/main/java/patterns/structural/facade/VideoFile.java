package patterns.structural.facade;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name.substring(0, name.indexOf("."));
        this.codecType = name.substring(name.indexOf(".") + 1, name.length());
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {

        return name;
    }
}
