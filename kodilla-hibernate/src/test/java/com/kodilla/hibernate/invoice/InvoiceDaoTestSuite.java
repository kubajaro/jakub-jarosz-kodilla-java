package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testSaveInvoice() {
        //given
        Product product1 = new Product("product1");
        Product product2= new Product("product2");
        Product product3 = new Product("product3");

        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();

        Item item1 = new Item(new BigDecimal(1), 1, new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2), 2, new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3), 3, new BigDecimal(3));

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item2);
        product3.getItems().add(item2);
        product3.getItems().add(item3);

        Invoice invoice = new Invoice("2539281736");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //then
        assertEquals(1, invoiceId);

        //cleanUp
        try{
            invoiceDao.deleteById(invoiceId);
            productDao.deleteById(product1Id);
            productDao.deleteById(product2Id);
            productDao.deleteById(product3Id);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
