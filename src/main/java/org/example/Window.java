package org.example;

public class Window {
    private boolean isOpen = false;

    public Window(boolean open) {
        this.isOpen = open;
    }

    public void isOpen() {
        isOpen = true;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "open=" + isOpen +
                '}';
    }

    public Window() {
    }
}
