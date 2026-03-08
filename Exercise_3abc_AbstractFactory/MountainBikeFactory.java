public class MountainBikeFactory extends BikeAbstractFactory {

    @Override
    public Wheel createWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public BikeFrame createFrame() {
        return new MountainBikeFrame();
    }
}
