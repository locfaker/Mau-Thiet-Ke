public class Architect {
    private Bedroom.BedroomBuilder builder;

    public Architect(Bedroom.BedroomBuilder builder) {
        this.builder = builder;
    }

    public Bedroom createBedroom() {
        return builder.build();
    }
}
