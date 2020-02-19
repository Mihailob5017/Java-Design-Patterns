package Proxy;

public class RealImage implements  Image {
    int size;
    String name;

    public RealImage(int size, String name) {
        this.size = size;
        this.name = name;
    }
    void imageSize(){
        System.out.println("Size:"+size+"MB");
    }
    @Override
    public void Show() {
        System.out.println("Image:"+name);
        imageSize();
    }
}
