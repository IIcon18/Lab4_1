package org.example;

public abstract class ComputerPeripheral {
    private String name;

    public ComputerPeripheral(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComputerPeripheral{" +
                "name='" + name + '\'' +
                '}';
    }
}
