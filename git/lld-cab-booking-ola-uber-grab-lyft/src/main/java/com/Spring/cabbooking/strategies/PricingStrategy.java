package com.Spring.cabbooking.strategies;

import com.Spring.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
