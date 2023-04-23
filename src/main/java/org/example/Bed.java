package org.example;

public class Bed {
    int dayToChangeBedSheets;

    public Bed(int dayToChangeBedSheets) {
        this.dayToChangeBedSheets = dayToChangeBedSheets;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "dayToChangeBedSheets=" + dayToChangeBedSheets +
                '}';
    }

    public Bed() {
    }
}
