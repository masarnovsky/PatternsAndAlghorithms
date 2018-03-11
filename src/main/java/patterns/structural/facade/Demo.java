package patterns.structural.facade;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        String file = facade.convertVideo("kittenvideo.mp4", "ogg");
    }
}
