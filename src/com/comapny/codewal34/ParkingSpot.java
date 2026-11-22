package com.comapny.codewal34;

public abstract class ParkingSpot {
   protected int spotID;
   protected boolean occipied;
   protected Vehicle vehicle;
   public ParkingSpot(int spotID) {
	this.spotID = spotID;
	this.occipied = false;
   }
  public abstract boolean canFitVehicle(Vehicle vehicle);
  public boolean parkVehicle(Vehicle vehicle) {
	  if (occipied || !canFitVehicle(vehicle)) {
		  return false;
	  }
	  this.vehicle = vehicle;
	  this.occipied = occipied;
	  return true;
  }
  public void removeVehicle() {
	  this.vehicle = null;
	  this.occipied = false;
  }

}
