package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Person person3 = Mockito.mock(Person.class);
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
        Mockito.verify(person1, Mockito.times(2)).receive(alert);
        Mockito.verify(person2, Mockito.times(0)).receive(alert);
        Mockito.verify(person3, Mockito.times(0)).receive(alert);
    }

    @Test
    public void personCaBeSubscribeToSpecificLocationOnlyOnce() {
        alertService.addPersonToLocation(person1, location1);
        alertService.addPersonToLocation(person1, location1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person3, Mockito.times(1)).receive(alert);
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
        Mockito.verify(person1, Mockito.times(2)).receive(alert);
        Mockito.verify(person2, Mockito.times(0)).receive(alert);
        Mockito.verify(person3, Mockito.times(1)).receive(alert);
    }

    @Test
    public void personUnsubscribedFromAllLocationsShouldNotReceiveAnyAlerts() {
        alertService.addPersonToLocation(person1, location2);
        alertService.addPersonToLocation(person1, location3);
        alertService.removePersonFromAllLocations(person1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        Mockito.verify(person1, Mockito.times(0)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person3, Mockito.times(1)).receive(alert);
    }

    @Test
    public void generalAlertShouldBeSendToAllPersonsSubscribedToAtLeastOneLocation() {
        alertService.addPersonToLocation(person3, location2);
        alertService.removePersonFromAllLocations(person1);
        alertService.sendGeneralAlert(alert);
        Mockito.verify(person1, Mockito.times(0)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
        Mockito.verify(person3, Mockito.times(1)).receive(alert);
    }

    @Test
    public void locationShouldBeRemove() {
        alertService.addPersonToLocation(person3, location2);
        alertService.removeLocation(location1);
        alertService.sendAlert(location1, alert);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        Mockito.verify(person1, Mockito.times(0)).receive(alert);
        Mockito.verify(person2, Mockito.times(0)).receive(alert);
        Mockito.verify(person3, Mockito.times(1)).receive(alert);
    }
}
