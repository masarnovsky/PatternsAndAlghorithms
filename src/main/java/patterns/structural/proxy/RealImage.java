package patterns.structural.proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("file was loaded from disk");
    }

    @Override
    public void display() {
        System.out.println("displaying image:" + filename);
    }
}
