package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public Set<Order> getOrdersFromValueRange (double min, double max) {
        Set<Order> ordersInRange = new HashSet<>();
        for(Order order : this.orders) {
            if(min < order.getValue() && max > order.getValue())
                ordersInRange.add(order);
        }
        return ordersInRange;
    }

    public Set<Order> getOrdersFromDateRange (LocalDate start, LocalDate end) {
        Set<Order> ordersInRange = new HashSet<>();
        for(Order order : this.orders) {
            if(order.getDate().isAfter(start) && order.getDate().isBefore(end))
                ordersInRange.add(order);
        }
        return ordersInRange;
    }

    public float getSumOfOrders() {
        float sum = 0;
        for(Order order : orders) {
            sum += order.getValue();
        }
        return sum;
    }
}
