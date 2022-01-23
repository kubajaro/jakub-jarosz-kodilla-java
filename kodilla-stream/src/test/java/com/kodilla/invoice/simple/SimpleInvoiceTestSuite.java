package com.kodilla.invoice.simple;

import com.kodilla.stream.invoice.simple.SimpleInvoice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay(){
        //given
        SimpleInvoice simpleInvoice = new SimpleInvoice();

        //when
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("P1", 17.28), 2.0));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("P2", 11.99), 3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("P1", 6.49), 5.0));

        //then
        assertEquals(108.975, simpleInvoice.getValueToPay(), 0.001);
    }
}
