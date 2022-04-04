package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testSaveInvoice() {
        //given
        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3), 3, new BigDecimal(3));
        Item item4 = new Item(new BigDecimal(4), 4, new BigDecimal(4));
        Item item5 = new Item(new BigDecimal(5), 5, new BigDecimal(5));

        Invoice invoice = new Invoice("2539281736");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //then
        assertEquals(1, invoiceId);

        //cleanUp
        try{
            invoiceDao.deleteById(invoiceId);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
