package com.tw.step.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldAddACarToParkedCars() {
    ParkingLot parkingLot = new ParkingLot(2,2,new Notifier(new ParkingLots(new ArrayList<>())));
    Car car = new Car("123");
    parkingLot.park(car);

    assertTrue(parkingLot.isParked(car));
  }

}