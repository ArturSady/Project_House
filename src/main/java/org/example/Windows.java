package org.example;

public class Windows {
    private boolean isOpen = false;

    public Windows(boolean open) {
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
}
