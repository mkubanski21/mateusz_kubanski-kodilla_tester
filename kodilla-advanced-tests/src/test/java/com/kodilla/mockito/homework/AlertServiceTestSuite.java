package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);
    Alert alert = Mockito.mock(Alert.class);


    @BeforeEach
    public void initializePersons() {
        alertService.addPersonToLocation(person1, location1);
        alertService.addPersonToLocation(person2, location1);
        alertService.addPersonToLocation(person3, location1);
    }

    @Test
    public void onlyPersonSubscribedToLocationShouldReceiveAlert() {
        alertService.addPersonToLocation(person1, location2);
        alertService.addPersonToLocation(person1, location3);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        assertEquals(2, person1.receive(alert)-1);
        assertEquals(0, person2.receive(alert)-1);
        assertEquals(0, person3.receive(alert)-1);
    }

    @Test
    public void personCaBeSubscribeToSpecificLocationOnlyOnce() {
        alertService.addPersonToLocation(person1, location1);
        alertService.addPersonToLocation(person1, location1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        assertEquals(1, person1.receive(alert)-1);
        assertEquals(1, person2.receive(alert)-1);
        assertEquals(1, person3.receive(alert)-1);
    }

    @Test
    public void personCanUnsubscribeLocationAndStopReceivingAlert() {
        alertService.addPersonToLocation(person1, location2);
        alertService.addPersonToLocation(person1, location3);
        alertService.removePersonFromLocation(person1, location3);
        alertService.removePersonFromLocation(person2, location1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        assertEquals(2, person1.receive(alert)-1);
        assertEquals(0, person2.receive(alert)-1);
        assertEquals(1, person3.receive(alert)-1);
    }

    @Test
    public void personUnsubscribedFromAllLocationsShouldNotReceiveAnyAlerts() {
            alertService.addPersonToLocation(person1, location2);
            alertService.addPersonToLocation(person1, location3);
            alertService.removePersonFromAllLocations(person1);
            alertService.sendAlert(location1, alert);
            alertService.sendAlert(location2, alert);
            alertService.sendAlert(location3, alert);
            assertEquals(0, person1.receive(alert)-1);
            assertEquals(1, person2.receive(alert)-1);
            assertEquals(1, person3.receive(alert)-1);
    }

    @Test
    public void generalAlertShouldBeSendToAllPersonsSubscribedToAtLeastOneLocation() {
        alertService.addPersonToLocation(person3, location2);
        alertService.removePersonFromAllLocations(person1);
        alertService.sendGeneralAlert(alert);
        assertEquals(0, person1.receive(alert)-1);
        assertEquals(1, person2.receive(alert)-1);
        assertEquals(1, person3.receive(alert)-1);
    }

    @Test
    public void locationShouldBeRemove() {
        alertService.addPersonToLocation(person3, location2);
        alertService.removeLocation(location1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        assertEquals(0, person1.receive(alert)-1);
        assertEquals(0, person2.receive(alert)-1);
        assertEquals(1, person3.receive(alert)-1);
    }
}
