package com.technology.device;

public class TestGadget {
    public static void main(String[] args) {
        Gadget gadget = new Gadget("Example Model", -50.0);
        System.out.println("Model: " + gadget.getModel());
        System.out.println("Price: " + gadget.getPrice());
        gadget.setModel("New Model");
        gadget.setPrice(149.99);

        System.out.println("Model (after update): " + gadget.getModel());
        System.out.println("Price (after update): " + gadget.getPrice());

    }
}
