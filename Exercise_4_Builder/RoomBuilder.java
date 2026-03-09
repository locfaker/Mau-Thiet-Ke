public interface RoomBuilder {
    RoomBuilder floor(int floor);
    RoomBuilder area(double area);
    RoomBuilder wallColor(String color);
    RoomBuilder bedSize(String size);
    RoomBuilder windowCount(int count);
    RoomBuilder balcony(boolean hasBalcony);
    RoomBuilder bathroom(boolean hasBathroom);
    RoomBuilder furnitureStyle(String style);
    Bedroom build();
}
