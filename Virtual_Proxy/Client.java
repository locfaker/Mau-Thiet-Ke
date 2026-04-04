package Virtual_Proxy;

public class Client {

    public static void main(String[] args) {
        System.out.println("Init proxy Image");
        
        ImageGallery imageGallery = new ImageGallery();
        DisplayObject image = new ImageProxy("resources/beach.png");

        System.out.println("-----------");
        System.out.println("call real service 1st");
        imageGallery.show(image);
        
        System.out.println("-----");
        System.out.println("call real service 2st");
        imageGallery.show(image);
    }
}
