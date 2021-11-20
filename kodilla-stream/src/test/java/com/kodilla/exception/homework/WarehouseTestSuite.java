package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInWarehouse() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        warehouse.addOrder(new Order("1"));
        // then
        assertEquals(new Order("1"), warehouse.getOrder("1"));
    }

        @Test
    public void testIsOrderInWarehouse_withException() {
            // given
            Warehouse warehouse = new Warehouse();
            // when
            // then
            assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("5"));
        }
}


