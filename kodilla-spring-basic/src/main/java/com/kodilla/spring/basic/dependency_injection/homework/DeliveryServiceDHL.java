package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryServiceDHL implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 40) {
            System.out.println("Package too heavy for DHL");
            return false;
        }
        System.out.println("Delivering by DHL in progress...");
        return true;
    }
}
