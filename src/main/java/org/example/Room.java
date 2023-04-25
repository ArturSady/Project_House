package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Room {
    private Bed bed;
    private ArrayList<Window> windows;





    public Room(Bed bed, ArrayList<Window> windows) {
        this.bed = bed;
        this.windows = windows;
    }

    public Room() {
        this.bed = new Bed(5);
        this.windows = new ArrayList<Window>();
        this.windows.add(new Window(false));
        this.windows.add(new Window(false));
    }
    public void cleanRoom(){
        bed.dayToChangeBedSheets = 0;
        for (Window window : windows) {
            window.isOpen();
        }
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
