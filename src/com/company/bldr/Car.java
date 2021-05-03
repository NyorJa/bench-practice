package com.company.bldr;

public class Car {
    private final CarType carType;
    private final Engine engine;
    private final GPSNavigator gpsNavigator;
    private final int seats;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getFuel() {
        return fuel;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }
}
