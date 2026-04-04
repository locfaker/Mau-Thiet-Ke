package Adapter;

public class UKCarPriceAdapter implements PriceCalculator {
    private UKCarPriceCalculator ukCarPriceCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public double calculatePrice() {
        double ukPrice = ukCarPriceCalculator.getPrice();
        return convertToUsd(ukPrice);
    }
    
    private double convertToUsd(double ukPrice) {
        return ukPrice * 1.27;
    }
}
