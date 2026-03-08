public class BikeFactory {
    private BikeFactory() {}

    public static BikeAbstractFactory getFactory(BikeType bikeType) {
        switch (bikeType) {
            case MOUNTAIN:
                return new MountainBikeFactory();
            case ROAD:
                return new RoadBikeFactory();
            default:
                throw new IllegalArgumentException("Loại xe không hợp lệ: " + bikeType);
        }
    }
}
