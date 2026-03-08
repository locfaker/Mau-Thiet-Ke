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
    public static class BedroomBuilder {
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

        // Constructor bắt buộc: tầng và diện tích
        public BedroomBuilder(int floor, double area) {
            this.floor = floor;
            this.area = area;
        }

        public BedroomBuilder withWallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public BedroomBuilder withBedSize(String bedSize) {
            this.bedSize = bedSize;
            return this;
        }

        public BedroomBuilder withWindowCount(int windowCount) {
            this.windowCount = windowCount;
            return this;
        }

        public BedroomBuilder withBalcony(boolean hasBalcony) {
            this.hasBalcony = hasBalcony;
            return this;
        }

        public BedroomBuilder withBathroom(boolean hasBathroom) {
            this.hasBathroom = hasBathroom;
            return this;
        }

        public BedroomBuilder withFurnitureStyle(String furnitureStyle) {
            this.furnitureStyle = furnitureStyle;
            return this;
        }

        public Bedroom build() {
            return new Bedroom(this);
        }
    }
}
