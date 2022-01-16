package com.kodilla.testing.weather.stub;

import com.kodilla.testing.testing.weather.stub.Temperatures;
import com.kodilla.testing.testing.weather.stub.TemperaturesStub;
import com.kodilla.testing.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub(){
        //given
        Temperatures temperetures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperetures);

        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
