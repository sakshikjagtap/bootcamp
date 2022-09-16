package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;

public class ParkingLotAttendant {

  private ArrayList<ParkingLot> parkingLots;

  public ParkingLotAttendant(ArrayList<ParkingLot> parkingLots) {

    this.parkingLots = parkingLots;
  }

  public void park(Car car) {
    for (ParkingLot parkingLot : parkingLots) {
      if (!parkingLot.isFull()){
        parkingLot.park(car);
        return;
      }
    }
  }
}
