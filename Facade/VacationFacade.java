package Facade;

public class VacationFacade {
    private static final VacationFacade INSTANCE = new VacationFacade();
    
    private CarRental carRental;
    private Hotel hotel;
    private Flight flight;

    private VacationFacade() {
        carRental = new CarRental();
        hotel = new Hotel();
        flight = new Flight();
    }
    
    public static VacationFacade getINSTANCE() {
        return INSTANCE;
    }

    public void bookVacation() {
        flight.bookFlight();
        hotel.bookRoom();
        carRental.bookCar();
    }
}
