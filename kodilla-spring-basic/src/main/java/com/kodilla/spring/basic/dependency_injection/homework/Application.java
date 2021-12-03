package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryServiceDPD = new DeliveryServiceDPD();
        NotificationService notificationServiceDPD = new NotificationServiceDPD();
        ShippingCenter shippingCenterDPD = new ShippingCenter(deliveryServiceDPD, notificationServiceDPD);
        shippingCenterDPD.sendPackage("Hill Street 11, New York", 25.3);
        System.out.println("------------------");
        DeliveryService deliveryServiceDHL = new DeliveryServiceDHL();
        NotificationService notificationServiceDHL = new NotificationServiceDHL();
        ShippingCenter shippingCenterDHL = new ShippingCenter(deliveryServiceDHL, notificationServiceDHL);
        shippingCenterDHL.sendPackage("Green Street 15, New York", 60.7);
    }
}