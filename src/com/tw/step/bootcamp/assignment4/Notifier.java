package com.tw.step.bootcamp.assignment4;

import java.util.ArrayList;

public class Notifier {

  private final ArrayList<Observer> observers;

  public Notifier(ArrayList<Observer> observers) {
    this.observers = observers;
  }

  public  void notifyToPromote(int lotNumber) {
    for (Observer observer : observers) {
   observer.addNotification(String.format("%d parking lot has less than 20 percent occupancy",lotNumber));
    }
  }

  public void notifyToAssign(int lotNumber) {
    for (Observer observer : observers) {
    observer.addNotification(String.format("%d parking lot has more than 80 percent occupancy",lotNumber));
    }
  }

  public void notifyFilled(int lotNumber) {
    for (Observer observer : observers) {
    observer.addNotification(String.format("%d parking lot is filled",lotNumber));
    }
  }
}
