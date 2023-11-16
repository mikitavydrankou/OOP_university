package com.technology.device;

class Gadget {
    private String model;
    private double price;

    public Gadget(String model, double price) {
        this.model = model;
        if (price < 0) {
            this.price = 99.99;
        } else {
            this.price = price;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
