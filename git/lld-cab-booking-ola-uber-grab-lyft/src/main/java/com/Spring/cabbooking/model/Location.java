package com.Spring.cabbooking.model;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString

@AllArgsConstructor
public class Location {
  private Double x;
  private Double y;

  public Double distance(Location location2) {
    return sqrt( pow(this.x - location2.x, 2) + pow(this.y - location2.y, 2) );
  }

public Double getX() {
	return x;
}

public void setX(Double x) {
	this.x = x;
}

public Double getY() {
	return y;
}

public void setY(Double y) {
	this.y = y;
}

public Location() {
	super();
}

public Location(Double x, Double y) {
	super();
	this.x = x;
	this.y = y;
}

@Override
public String toString() {
	return "Location [x=" + x + ", y=" + y + "]";
}

  
  
}
