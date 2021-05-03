package com.company.bldr;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public double getVolume() {
        return volume;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        }
        else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void off() {
        started = false;
    }

    public void on() {
        started = true;
    }
}
