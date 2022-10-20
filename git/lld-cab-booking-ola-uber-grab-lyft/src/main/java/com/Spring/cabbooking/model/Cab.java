package com.Spring.cabbooking.model;

import lombok.Getter;
import lombok.Setter;


public class Cab {
  String id;
  String driverName;

  Trip currentTrip;
   Location currentLocation;
   Boolean isAvailable;
   

  public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDriverName() {
	return driverName;
}

public void setDriverName(String driverName) {
	this.driverName = driverName;
}

public Trip getCurrentTrip() {
	return currentTrip;
}

public void setCurrentTrip(Trip currentTrip) {
	this.currentTrip = currentTrip;
}

public Location getCurrentLocation() {
	return currentLocation;
}

public void setCurrentLocation(Location currentLocation) {
	this.currentLocation = currentLocation;
}

public Boolean getIsAvailable() {
	return isAvailable;
}

public void setIsAvailable(Boolean isAvailable) {
	this.isAvailable = isAvailable;
}



  public Cab(String id, String driverName) {
	super();
	this.id = id;
	this.driverName = driverName;
	this.isAvailable = isAvailable;
}

@Override
  public String toString() {
    return "Cab{" +
        "id='" + id + '\'' +
        ", driverName='" + driverName + '\'' +
        ", currentLocation=" + currentLocation +
        ", isAvailable=" + isAvailable +
        '}';
  }

public Cab() {
	super();
}
  
}
