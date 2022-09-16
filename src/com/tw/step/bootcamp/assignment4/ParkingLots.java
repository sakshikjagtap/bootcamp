package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class ParkingLots {


  private final ArrayList<String> notifications;
  private ArrayList<ParkingLot> parkingLots;

  public ParkingLots(ArrayList<ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
    this.notifications = new ArrayList<String>();
  }

  public void addNotification(String notification) {
    notifications.add(notification);
  }

  public ArrayList<String> getNotifications() {
    return notifications;
  }
}
