package Adapter;

public class TruckPriceCalculator implements PriceCalculator {
    private double basePrice;
    private double weightFee;

    public TruckPriceCalculator(double basePrice, double weightFee) {
        this.basePrice = basePrice;
        this.weightFee = weightFee;
    }

    @Override
    public double calculatePrice() {
        return basePrice + weightFee;
    }
}
