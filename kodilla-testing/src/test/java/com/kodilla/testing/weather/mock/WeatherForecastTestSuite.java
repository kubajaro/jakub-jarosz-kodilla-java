package com.kodilla.testing.weather.mock;

import com.kodilla.testing.testing.weather.stub.Temperatures;
import com.kodilla.testing.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
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

    @Test
    void testCalculateForecastWithMock(){
        //given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Wroclaw", 22.5);
        temperaturesMap.put("Rzeszow", 27.3);
        temperaturesMap.put("Lublin", 19.9);
        temperaturesMap.put("Szczecin", 23.8);
        temperaturesMap.put("Olsztyn", 20.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
