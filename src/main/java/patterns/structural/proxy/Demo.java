package patterns.structural.proxy;

public class Demo {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("pic1.jpg");
        Image image2 = new ProxyImage("pic2.jpg");
        image1.display();
        image1.display();
        image2.display();
        image2.display();
        image1.display();
    }
}
