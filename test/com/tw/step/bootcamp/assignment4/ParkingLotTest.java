package com.tw.step.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldAddACarToParkedCars() {
    ArrayList<Observer> observers = new ArrayList<Observer>(Arrays.asList(new ParkingLotAttendant()));
    Notifier notifier = new Notifier(observers);
    ParkingLot parkingLot = new ParkingLot(2,2,notifier);
    Car car = new Car("123");
    parkingLot.park(car);

    assertTrue(parkingLot.isParked(car));
  }

}