package com.kodilla.testing.testing.weather.stub;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature:
                temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double countAverageTemperature(){
        double sum = 0;

        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            sum += temperature.getValue();
        }

        int temp = (int)(sum/temperatures.getTemperatures().size()*100);
        double result = temp/100.0;

        return result;
    }

    public double medianTemperature(){
        Map<String, Double> temperaturesMap = temperatures.getTemperatures();
        int mapSize = temperaturesMap.size();
        double [] temperaturesArray = new double [mapSize];
        int index = 0;
        double result;

        for(Map.Entry<String, Double> temperature: temperaturesMap.entrySet()){
            temperaturesArray[index] = temperature.getValue();
            index++;
        }

        Arrays.sort(temperaturesArray);

        if(mapSize % 2 == 0){
            double sumOfMiddleElements = (temperaturesArray[mapSize/2]+
                                temperaturesArray[mapSize/2-1]);
            result = sumOfMiddleElements / 2;
        }else{
            result = temperaturesArray[mapSize/2];
        }

        return result;
    }
}