public class Architect {
    private RoomBuilder builder;

    public Architect(RoomBuilder builder) {
        this.builder = builder;
    }

    public Bedroom constructStandardBedroom(int floor, double area) {
        return builder.floor(floor)
                      .area(area)
                      .wallColor("Trắng")
                      .bedSize("Đôi")
                      .windowCount(1)
                      .build();
    }

    public Bedroom constructLuxuryBedroom(int floor, double area) {
        return builder.floor(floor)
                      .area(area)
                      .wallColor("Vàng kem")
                      .bedSize("King size")
                      .windowCount(3)
                      .balcony(true)
                      .bathroom(true)
                      .furnitureStyle("Hoàng gia")
                      .build();
    }
}
