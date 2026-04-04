package Virtual_Proxy;

public class ImageFile implements DisplayObject {
    private String path;

    public ImageFile(String path) {
        this.path = path;
        load();
    }

    private void load() {
        System.out.println("Image loaded " + path);
    }

    @Override
    public void display() {
        System.out.println("Image showed " + path);
    }
}
