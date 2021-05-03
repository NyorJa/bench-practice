package com.company.bldr;

public interface Builder {
    void setCarType(CarType type);

    void setEngine(Engine engine);

    void setGPSNavigator(GPSNavigator gpsNavigator);

    void setSeats(int seats);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);
}
