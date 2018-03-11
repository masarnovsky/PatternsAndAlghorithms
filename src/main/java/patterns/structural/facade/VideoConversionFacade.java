package patterns.structural.facade;

public class VideoConversionFacade {
    private static String MP4_TYPE = "mp4";

    public String convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: convertion started");
        VideoFile file = new VideoFile(fileName);
        Codec codec = CodecFactory.extract(file);
        Codec destination;
        if (format.equals(MP4_TYPE)) {
            destination = new OggCompressionCodec();
        } else {
            destination = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, codec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destination);
        System.out.println("VideoConversionFacade: convertion completed");
        return intermediateResult.getName() + "." + format;
    }
}
