package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;

public class ParkingLot {

  private final ArrayList<Car> parkedCars;
  private int lotSize;

  public ParkingLot(int lotSize) {
    this.lotSize = lotSize;
    this.parkedCars = new ArrayList<>();
  }

  public void park(Car car) {
    this.parkedCars.add(car);
  }

  public boolean isParked(Car car) {
    return parkedCars.contains(car);
  }

  public boolean isFull() {
    return parkedCars.size() == this.lotSize;
  }
}
