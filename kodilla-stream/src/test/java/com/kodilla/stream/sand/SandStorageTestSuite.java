package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity(){
        //given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //when
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent: continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //then
        BigDecimal expected = new BigDecimal("211111110903703703670");
        assertEquals(expected, totalSand);
    }
}
