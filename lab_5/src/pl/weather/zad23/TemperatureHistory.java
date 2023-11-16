package pl.weather.zad23;

import java.util.ArrayList;

public class TemperatureHistory {
    private ArrayList<Double> temperatures;

    public TemperatureHistory(){
        this.temperatures = new ArrayList<>();
    }

    public ArrayList getTemperatures(){
        return temperatures;
    }
    public void setTemperatures(ArrayList temperatures){
        this.temperatures = temperatures;
    }

    public void addTemperatures(double temperature){
        temperatures.add(temperature);
    }

    public void removeTemperature(int index){
        if(index >= 0 && index < temperatures.size()){
            temperatures.remove(index);
        }
    }

    public double averageTemperature(){
        if(temperatures.isEmpty()){
            return 0.0;
        }

        double sum = 0;

        for(int i = 0; i < temperatures.size(); i++){
            sum += temperatures.get(i);
        }
        return sum/temperatures.size();
    }

}
