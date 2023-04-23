package org.example;

import java.util.ArrayList;

public class Room {
    private Bed bed;
    private ArrayList<Window> windows;


    public Room(Bed bed, ArrayList<Window> windows) {
        this.bed = bed;
        this.windows = windows;
    }
    public void changeBedSheet(){
        bed.dayToChangeBedSheets = 0;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", window=" + windows +
                '}';
    }
}
