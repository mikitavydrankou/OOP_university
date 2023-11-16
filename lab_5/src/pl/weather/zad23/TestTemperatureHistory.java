package pl.weather.zad23;

public class TestTemperatureHistory {
    public static void main(String[] args) {
        TemperatureHistory history = new TemperatureHistory();

        history.addTemperatures(10.3);
        history.addTemperatures(15.1);
        history.addTemperatures(17.8);

        System.out.println("Temps: " + history.getTemperatures());

        history.removeTemperature(1);

        System.out.println("Updated temps: " + history.getTemperatures());

        double average = history.averageTemperature();
        System.out.println("Average Temperature: " + average);
    }
}
