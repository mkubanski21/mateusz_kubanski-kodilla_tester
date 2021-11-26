package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(new Order(20, LocalDate.of(2021, 11, 25), "piotr"));
        shop.addOrder(new Order(220.6, LocalDate.of(2021, 11, 20), "pawel"));
        shop.addOrder(new Order(220.6, LocalDate.of(2021, 11, 20), "pawel"));
        shop.addOrder(new Order(120, LocalDate.of(2021, 11, 2), "mateusz"));
        shop.addOrder(new Order(15.95, LocalDate.of(2021, 9, 30), "marek"));
        shop.addOrder(new Order(15.95, LocalDate.of(2021, 9, 30), "marek"));
    }

    @Test
    public void shouldAddFourOrdersToSet() {
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    public void shouldFindOrdersFromDateRange() {
        Set<Order> orders = shop.getOrdersFromDateRange(LocalDate.of(2021, 11, 5), LocalDate.of(2021, 11, 30));
        assertEquals(2, orders.size());
    }

    @Test
    public void shouldFindOrdersFromValueRange() {
        Set<Order> orders = shop.getOrdersFromValueRange(100, 230);
        assertEquals(2, orders.size());
    }

    @Test
    public void shouldCalculateSumOfOrdersValue() {
        assertEquals(376.55, shop.getSumOfOrders(), 0.01);
    }
}