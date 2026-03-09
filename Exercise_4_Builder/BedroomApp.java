public class BedroomApp {
    public static void main(String[] args) {
        // 1. Dùng Builder trực tiếp (cách linh hoạt)
        Bedroom customRoom = new Bedroom.BedroomBuilder()
                .floor(1)
                .area(20.0)
                .wallColor("Xám hiện đại")
                .bedSize("Đơn")
                .build();
        
        System.out.println("=== Phòng tự thiết kế bằng Builder ===");
        System.out.println(customRoom);

        // 2. Dùng Architect (cách chuẩn hóa - Director)
        RoomBuilder builder = new Bedroom.BedroomBuilder();
        Architect architect = new Architect(builder);

        Bedroom standardRoom = architect.constructStandardBedroom(2, 25.5);
        System.out.println("=== Phòng tiêu chuẩn từ Kiến trúc sư ===");
        System.out.println(standardRoom);

        Bedroom luxuryRoom = architect.constructLuxuryBedroom(10, 50.0);
        System.out.println("=== Phòng cao cấp từ Kiến trúc sư ===");
        System.out.println(luxuryRoom);
    }
}
