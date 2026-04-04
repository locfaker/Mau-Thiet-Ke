package Adapter;

public class CarPriceCalculator implements PriceCalculator {
    private double basePrice;
    private double taxRate;

    public CarPriceCalculator(double basePrice, double taxRate) {
        this.basePrice = basePrice;
        this.taxRate = taxRate;
    }

    @Override
    public double calculatePrice() {
        return basePrice + (basePrice * taxRate);
    }
}
