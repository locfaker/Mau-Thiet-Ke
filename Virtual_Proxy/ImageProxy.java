package Virtual_Proxy;

public class ImageProxy implements DisplayObject {
    private String imagePath;
    private ImageFile imageFile;

    public ImageProxy(String imagePath) {
        this.imagePath = imagePath;
        System.out.println("Image unloaded " + imagePath);
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(imagePath);
        } else {
            System.out.println("Image already existed " + imagePath);
        }

        imageFile.display();
    }
}
