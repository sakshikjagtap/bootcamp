package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;

public class ParkingLotAttendant  implements Observer{

  private final ArrayList<String> notifications;
  private ArrayList<ParkingLot> parkingLots;

  public ParkingLotAttendant() {
    this.parkingLots = new ArrayList<ParkingLot>();
    this.notifications = new ArrayList<String>();
  }

  public void park(Car car) {
    for (ParkingLot parkingLot : parkingLots) {
      if (!parkingLot.isFull()){
        parkingLot.park(car);
        return;
      }
    }
  }

  public void addParkingLot(ParkingLot parkingLot){
    this.parkingLots.add(parkingLot);
  }

  @Override
  public void addNotification(String notification) {
    this.notifications.add(notification);
  }
}
