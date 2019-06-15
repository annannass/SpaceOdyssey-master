package com.snow.model;

public class WindProperties {
    private double maximumWind;
    private double minimumWind;
    private double averageWind;

    public WindProperties () {}

    public WindProperties(double maximumWind, double minimumWind, double averageWind) {
        this.maximumWind = maximumWind;
        this.minimumWind = minimumWind;
        this.averageWind = averageWind;
    }

    public double getMaximumWind() {
        return maximumWind;
    }

    public void setMaximumWind(double maximumWind) {
        this.maximumWind = maximumWind;
    }

    public double getMinimumWind() {
        return minimumWind;
    }

    public void setMinimumWind(double minimumWind) {
        this.minimumWind = minimumWind;
    }

    public double getAverageWind() {
        return averageWind;
    }

    public void setAverageWind(double averageWind) {
        this.averageWind = averageWind;
    }
}
