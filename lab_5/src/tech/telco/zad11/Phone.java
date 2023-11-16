package tech.telco.zad11;

public class Phone {
    public String manufacturer;
    public String model;
    public String operatingSystem;

    {
        operatingSystem = "Android";
    }

    public Phone(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = "iOS";
    }

}
