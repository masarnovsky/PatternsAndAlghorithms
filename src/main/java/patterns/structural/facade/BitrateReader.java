package patterns.structural.facade;

public class BitrateReader {

    public static VideoFile read(VideoFile videoFile, Codec codec) {
        System.out.println("BitrateReader: reading file");
        return videoFile;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file");
        return buffer;
    }
}
