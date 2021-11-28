package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();

    PersonInterface person1 = Mockito.mock(PersonInterface.class);
    PersonInterface person2 = Mockito.mock(PersonInterface.class);

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);

    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void OnlyPersonSubscribedToLocationShouldReceiveAlert() {
        alertService.addPersonToLocation(person1, location1);
        alertService.addPersonToLocation(person1, location2);
        alertService.addPersonToLocation(person2, location1);
        alertService.sendAlert(location2, alert);
        alertService.sendAlert(location3, alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.never()).receive(alert);

    }


//    @Test
//    public void GeneralAlertShouldBeSendToAllPersonsSubscribedToAtLeastOneLocation() {
//    }
//
//    @Test
//    public void AlertShouldBeSendToAllPersonsSubscribedToSpecificLocation() {
//    }
//
//    @Test
//    public void PersonUnsubscribedFromSpecificLocationShouldNotReceiveAlerts() {
//    }
//
//    @Test
//    public void PersonUnsubscribedFromAllLocationsShouldNotReceiveGeneralAlerts() {
//    }
//
//    @Test
//    public void LocationShouldBeRemove() {
//    }
}
