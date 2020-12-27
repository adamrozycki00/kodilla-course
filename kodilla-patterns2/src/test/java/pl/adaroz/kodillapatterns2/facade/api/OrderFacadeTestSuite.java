package pl.adaroz.kodillapatterns2.facade.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderFacadeTestSuite {

    @Autowired
    OrderFacade orderFacade;

    @Test
    void testShopFacade() {
        OrderDto order = new OrderDto();
        order.addItem(new ItemDto(10L, 2));
        order.addItem(new ItemDto(216L, 1));
        order.addItem(new ItemDto(25L, 1));
        order.addItem(new ItemDto(11L, 3));
        try {
            orderFacade.processOrder(order, 1L);
        } catch (OrderProcessingException e) {
        }
    }

}
