package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerPeripheral keyboard = new Keyboard("Logitech G Pro", "Mechanical");
        ComputerPeripheral headphones = new Headphones("Sony WH-1000XM4", true);
        ComputerPeripheral graphicsTablet = new GraphicsTablet("Wacom Intuos", 4096);

        System.out.println(keyboard);
        System.out.println(headphones);
        System.out.println(graphicsTablet);
    }
}