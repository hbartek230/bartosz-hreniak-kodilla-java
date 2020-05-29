package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        // given
        Product product1 = new Product("Produkt1");
        Product product2 = new Product("Produkt2");
        Product product3 = new Product("Produkt3");
        Product product4 = new Product("Produkt4");
        Product product5 = new Product("Produkt5");

        Item item1 = new Item(product1, new BigDecimal(10), 3, new BigDecimal(30));
        Item item2 = new Item(product2, new BigDecimal(15), 2, new BigDecimal(30));
        Item item3 = new Item(product3, new BigDecimal(12), 4, new BigDecimal(48));
        Item item4 = new Item(product4, new BigDecimal(30), 10, new BigDecimal(300));
        Item item5 = new Item(product5, new BigDecimal(120), 8, new BigDecimal(960));

        Invoice invoice1 = new Invoice("123/987", Arrays.asList(item1, item2, item3, item4, item5));
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        item5.setInvoice(invoice1);

        // when
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(invoice1.getItems().get(0).getProduct().getName(),
                itemDao.findByProduct(product1).getProduct().getName()
        );
        Assert.assertEquals(invoice1.getItems().get(1).getProduct().getName(),
                itemDao.findByProduct(product2).getProduct().getName())
        ;
        Assert.assertEquals(invoice1.getItems().get(2).getProduct().getName(),
                itemDao.findByProduct(product3).getProduct().getName()
        );
        Assert.assertEquals(invoice1.getItems().get(3).getProduct().getName(),
                itemDao.findByProduct(product4).getProduct().getName()
        );
        Assert.assertEquals(invoice1.getItems().get(4).getProduct().getName(),
                itemDao.findByProduct(product5).getProduct().getName()
        );

        // clearUp
        invoiceDao.deleteById(id);
    }
}
