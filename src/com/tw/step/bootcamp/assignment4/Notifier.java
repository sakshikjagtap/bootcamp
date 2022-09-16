package com.tw.step.bootcamp.assignment4;

public class Notifier {

  private final ParkingLots parkingLots;

  public Notifier(ParkingLots parkingLots) {
    this.parkingLots = parkingLots;
  }

  public  void notifyToPromote(int lotNumber) {
   parkingLots.addNotification(String.format("%d parking lot has less than 20 percent occupancy",lotNumber));
  }

  public void notifyToAssign(int lotNumber) {
    parkingLots.addNotification(String.format("%d parking lot has more than 80 percent occupancy",lotNumber));
  }

  public void notifyFilled(int lotNumber) {
    parkingLots.addNotification(String.format("%d parking lot is filled",lotNumber));
  }
}
