package Adapter;

public class Client {

    public static void main(String[] args) {
        PriceCalculator carPriceCalculator = new CarPriceCalculator(20000, 0.1);
        PriceCalculator truckPriceCalculator = new TruckPriceCalculator(32000, 4500);
        PriceCalculator ukCarPriceAdapter = new UKCarPriceAdapter(new UKCarPriceCalculator(18000, 650));

        System.out.println("Car price in USD: " + carPriceCalculator.calculatePrice());
        System.out.println("Truck price in USD: " + truckPriceCalculator.calculatePrice());
        System.out.println("UK car price adapted to USD: " + ukCarPriceAdapter.calculatePrice());
    }
}
