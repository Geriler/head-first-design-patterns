package com.geriler.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) System.out.println("Improving weather on the way!");
        if (currentPressure == lastPressure) System.out.println("More of the same");
        if (currentPressure < lastPressure) System.out.println("Watch out for cooler, rainy weather");
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
