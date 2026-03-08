public class RoadBikeFactory extends BikeAbstractFactory {

    @Override
    public Wheel createWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public BikeFrame createFrame() {
        return new RoadBikeFrame();
    }
}
