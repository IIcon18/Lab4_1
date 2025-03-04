package org.example;

public class Headphones extends ComputerPeripheral {
    private boolean wireless;

    public Headphones(String name, boolean wireless) {
        super(name);
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones: " + getName() + ", Wireless: " + (wireless ? "Yes" : "No");
    }
}