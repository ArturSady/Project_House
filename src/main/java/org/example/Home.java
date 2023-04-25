package org.example;

import java.util.ArrayList;

public class Home {
    private ArrayList<Room> rooms;


    public Home(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Home{" +
                "room=" + rooms +
                '}';
    }
}
