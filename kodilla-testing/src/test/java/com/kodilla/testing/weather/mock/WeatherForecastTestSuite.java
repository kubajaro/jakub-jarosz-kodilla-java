package com.kodilla.testing.weather.mock;

import com.kodilla.testing.testing.weather.stub.Temperatures;
import com.kodilla.testing.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void createMap(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Wroclaw", 22.5);
        temperaturesMap.put("Rzeszow", 27.3);
        temperaturesMap.put("Lublin", 19.9);
        temperaturesMap.put("Szczecin", 23.8);
        temperaturesMap.put("Olsztyn", 20.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock(){
        //given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature(){
        //given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //when
        double result = weatherForecast.countAverageTemperature();

        //then
        Assertions.assertEquals(22.72, result);
    }

    @Test
    void testMedianTemperature(){
        //given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //when
        double result = weatherForecast.medianTemperature();

        //then
        Assertions.assertEquals(22.5, result);
    }

}
