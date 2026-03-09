public class Bedroom {
    // 8 fields
    private final int floor;              // tầng
    private final double area;            // diện tích (m2)
    private final String wallColor;       // màu tường
    private final String bedSize;         // kích thước giường
    private final int windowCount;        // số cửa sổ
    private final boolean hasBalcony;     // có ban công
    private final boolean hasBathroom;    // có phòng tắm riêng
    private final String furnitureStyle;  // phong cách nội thất

    private Bedroom(BedroomBuilder builder) {
        this.floor = builder.floor;
        this.area = builder.area;
        this.wallColor = builder.wallColor;
        this.bedSize = builder.bedSize;
        this.windowCount = builder.windowCount;
        this.hasBalcony = builder.hasBalcony;
        this.hasBathroom = builder.hasBathroom;
        this.furnitureStyle = builder.furnitureStyle;
    }

    @Override
    public String toString() {
        return "Bedroom [" +
                "\n  Tầng: " + floor +
                "\n  Diện tích: " + area + " m2" +
                "\n  Màu tường: " + wallColor +
                "\n  Giường: " + bedSize +
                "\n  Số cửa sổ: " + windowCount +
                "\n  Ban công: " + (hasBalcony ? "Có" : "Không") +
                "\n  Phòng tắm riêng: " + (hasBathroom ? "Có" : "Không") +
                "\n  Phong cách: " + furnitureStyle +
                "\n]";
    }

    // Inner Builder class
    public static class BedroomBuilder implements RoomBuilder {
        // Thuộc tính bắt buộc
        private int floor;
        private double area;

        // Thuộc tính tùy chọn (có giá trị mặc định)
        private String wallColor = "Trắng";
        private String bedSize = "Đôi";
        private int windowCount = 1;
        private boolean hasBalcony = false;
        private boolean hasBathroom = false;
        private String furnitureStyle = "Hiện đại";

        public BedroomBuilder floor(int floor) {
            this.floor = floor;
            return this;
        }

        public BedroomBuilder area(double area) {
            this.area = area;
            return this;
        }

        public BedroomBuilder wallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public BedroomBuilder bedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }

        public BedroomBuilder windowCount(int windowCount) {
            this.windowCount = windowCount;
            return this;
        }

        public BedroomBuilder balcony(boolean hasBalcony) {
            this.hasBalcony = hasBalcony;
            return this;
        }

        public BedroomBuilder bathroom(boolean hasBathroom) {
            this.hasBathroom = hasBathroom;
            return this;
        }

        public BedroomBuilder furnitureStyle(String furnitureStyle) {
            this.furnitureStyle = furnitureStyle;
            return this;
        }

        @Override
        public Bedroom build() {
            return new Bedroom(this);
        }
    }
}
