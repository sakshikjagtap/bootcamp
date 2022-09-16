package com.tw.step.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void shouldAddACarToParkedCars() {
    ParkingLot parkingLot = new ParkingLot(2);
    Car car = new Car("123");
    parkingLot.park(car);

    assertTrue(parkingLot.isParked(car));
  }

  @Test
  void shouldKnowWhenParkinLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(2);
    Car car = new Car("123");
    Car car1 = new Car("1234");

    parkingLot.park(car);
    parkingLot.park(car1);

    assertTrue(parkingLot.isFull());


  }
}