public interface Sensor {
    double readValue();
    String getStatus();
    void reset();
}

class TemperatureSensor implements Sensor{
    private double temperature;
    private String status;

    public TemperatureSensor(double initialTemperature, String initialStatus) {
        this.temperature = initialTemperature;
        this.status = initialStatus;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        temperature = 0.0;
        status = "Reset";
    }
}

class PressureSensor implements Sensor {
    private double pressure;
    private String status;

    public PressureSensor(double initialPressure, String initialStatus) {
        this.pressure = initialPressure;
        this.status = initialStatus;
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        pressure = 0.0;
        status = "Reset";
    }
}

class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(25.0, "Normal");
        System.out.println("Temperature Sensor - Initial Status: " + temperatureSensor.getStatus());
        System.out.println("Temperature Sensor - Initial Value: " + temperatureSensor.readValue());

        temperatureSensor.reset();
        System.out.println("Temperature Sensor - After Reset - Status: " + temperatureSensor.getStatus());
        System.out.println("Temperature Sensor - After Reset - Value: " + temperatureSensor.readValue());

        PressureSensor pressureSensor = new PressureSensor(1013.25, "Normal");
        System.out.println("\nPressure Sensor - Initial Status: " + pressureSensor.getStatus());
        System.out.println("Pressure Sensor - Initial Value: " + pressureSensor.readValue());

        pressureSensor.reset();
        System.out.println("Pressure Sensor - After Reset - Status: " + pressureSensor.getStatus());
        System.out.println("Pressure Sensor - After Reset - Value: " + pressureSensor.readValue());
    }
}
