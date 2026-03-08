public class BikeApp {
    public static void main(String[] args) {
        // Tạo xe đạp địa hình
        System.out.println("=== Xe đạp địa hình (Mountain Bike) ===");
        BikeAbstractFactory mountainFactory = BikeFactory.getFactory(BikeType.MOUNTAIN);
        Wheel mountainWheel = mountainFactory.createWheel();
        BikeFrame mountainFrame = mountainFactory.createFrame();
        mountainWheel.create();
        mountainFrame.create();

        System.out.println();

        // Tạo xe đạp đường trường
        System.out.println("=== Xe đạp đường trường (Road Bike) ===");
        BikeAbstractFactory roadFactory = BikeFactory.getFactory(BikeType.ROAD);
        Wheel roadWheel = roadFactory.createWheel();
        BikeFrame roadFrame = roadFactory.createFrame();
        roadWheel.create();
        roadFrame.create();
    }
}
