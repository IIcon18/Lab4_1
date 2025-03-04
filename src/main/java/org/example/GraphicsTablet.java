package org.example;

public class GraphicsTablet extends ComputerPeripheral {
    private int penPressureLevels;

    public GraphicsTablet(String name, int penPressureLevels) {
        super(name);
        this.penPressureLevels = penPressureLevels;
    }

    @Override
    public String toString() {
        return "Graphics Tablet: " + getName() + ", Pen Pressure Levels: " + penPressureLevels;
    }
}