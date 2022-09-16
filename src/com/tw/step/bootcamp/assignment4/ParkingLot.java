package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;

public class ParkingLot {

  private final ArrayList<Car> parkedCars;
  private int lotNumber;
  private int lotSize;
  private Notifier notifier;

  public ParkingLot(int lotNumber,int lotSize,Notifier notifier) {
    this.lotNumber = lotNumber;
    this.lotSize = lotSize;
    this.parkedCars = new ArrayList<>();
  }

  public void park(Car car) {
    this.parkedCars.add(car);
    sendNotification();
  }

  public boolean isParked(Car car) {
    return parkedCars.contains(car);
  }

  private void sendNotification() {
    double maxSize = lotSize * 1.0;
    double fillPercent = (parkedCars.size()/maxSize) * 100;
    if (fillPercent <20) {
      notifier.notifyToPromote(this.lotNumber);
      return;
    }
    if (fillPercent > 80){
      notifier.notifyToAssign(this.lotNumber);
      return;
    }
    if (isFull()){
      notifier.notifyFilled(this.lotNumber);
    }

  }

  public boolean isFull() {
    return parkedCars.size() == lotSize;
  }


}
