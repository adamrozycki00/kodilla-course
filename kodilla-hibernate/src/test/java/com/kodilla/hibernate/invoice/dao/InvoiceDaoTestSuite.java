package com.kodilla.hibernate.invoice.dao;

import com.google.common.collect.Iterables;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Item item1 = new Item(product1, new BigDecimal(10), 10, new BigDecimal(100));
        Item item2 = new Item(product1, new BigDecimal(20), 10, new BigDecimal(200));
        Item item3 = new Item(product1, new BigDecimal(30), 10, new BigDecimal(300));
        Item item4 = new Item(product2, new BigDecimal(40), 10, new BigDecimal(400));
        Item item5 = new Item(product2, new BigDecimal(50), 10, new BigDecimal(500));
        Item item6 = new Item(product3, new BigDecimal(60), 10, new BigDecimal(600));
        Invoice invoice1 = new Invoice("1/2020");
        Invoice invoice2 = new Invoice("2/2020");
        Invoice invoice3 = new Invoice("3/2020");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item4);
        invoice1.getItems().add(item5);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item6);
        invoice3.getItems().add(item3);

        //when
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        invoiceDao.save(invoice3);

        //then
        assertEquals(3, Iterables.size(productDao.findAll()));
        assertEquals(3, Iterables.size(invoiceDao.findAll()));

        //clean-up
        productDao.deleteById(product1.getId());
        productDao.deleteById(product2.getId());
        productDao.deleteById(product3.getId());
        invoiceDao.deleteById(invoice1.getId());
        invoiceDao.deleteById(invoice2.getId());
        invoiceDao.deleteById(invoice3.getId());
    }

}
