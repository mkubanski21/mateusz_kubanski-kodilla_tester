package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));

        try {
            System.out.println(warehouse.getOrder("8"));
            System.out.println("Searched order does exist in the system");
        } catch (OrderDoesntExistException e) {
            System.out.println("Searched order doesn't exist in the system");
        }
    }
}
