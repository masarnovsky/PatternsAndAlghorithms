package patterns.structural.facade;

public class CodecFactory {
    private static String MP4_TYPE = "mp4";

    public static Codec extract(VideoFile videoFile) {
        String type = videoFile.getCodecType();
        if (type.equals(MP4_TYPE)) {
            System.out.println("CodecFactory: extracting mpeg.. ");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg.. ");
            return new OggCompressionCodec();
        }
    }
}
