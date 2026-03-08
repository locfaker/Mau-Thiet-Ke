public class BedroomApp {
    public static void main(String[] args) {
        // Phòng ngủ đơn giản - chỉ cần tầng và diện tích
        Bedroom simple = new Bedroom.BedroomBuilder(1, 20.0)
                .build();
        System.out.println("=== Phòng ngủ đơn giản ===");
        System.out.println(simple);

        // Phòng ngủ đầy đủ tiện nghi
        Bedroom luxury = new Bedroom.BedroomBuilder(3, 35.5)
                .withWallColor("Xanh pastel")
                .withBedSize("King size")
                .withWindowCount(2)
                .withBalcony(true)
                .withBathroom(true)
                .withFurnitureStyle("Tân cổ điển")
                .build();
        System.out.println("=== Phòng ngủ cao cấp ===");
        System.out.println(luxury);

        // Dùng Architect (Director) để tạo
        Bedroom.BedroomBuilder builder = new Bedroom.BedroomBuilder(2, 25.0)
                .withWallColor("Hồng nhạt")
                .withBedSize("Đơn")
                .withWindowCount(1)
                .withBathroom(true);

        Architect architect = new Architect(builder);
        Bedroom room = architect.createBedroom();
        System.out.println("=== Phòng ngủ qua Architect ===");
        System.out.println(room);
    }
}
