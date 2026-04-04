package Adapter;

public class UKCarPriceCalculator {
    private double basePriceInGbp;
    private double serviceFeeInGbp;

    public UKCarPriceCalculator(double basePriceInGbp, double serviceFeeInGbp) {
        this.basePriceInGbp = basePriceInGbp;
        this.serviceFeeInGbp = serviceFeeInGbp;
    }

    public double getPrice() {
        return basePriceInGbp + serviceFeeInGbp;
    }
}
