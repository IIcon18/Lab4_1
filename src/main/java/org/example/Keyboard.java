package org.example;

public class Keyboard extends ComputerPeripheral {
    private String type;

    public Keyboard(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Keyboard: " + getName() + ", Type=" + type;
    }
}
