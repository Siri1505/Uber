package com.Spring.cabbooking.strategies;

import java.util.List;

import com.Spring.cabbooking.model.Cab;
import com.Spring.cabbooking.model.Location;
import com.Spring.cabbooking.model.Rider;

import lombok.NonNull;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

  @Override
  public Cab matchCabToRider(
      @NonNull final Rider rider,
      @NonNull final List<Cab> candidateCabs,
      @NonNull final Location fromPoint,
      @NonNull final Location toPoint) {
    if (candidateCabs.isEmpty()) {
      return null;
    }
    return candidateCabs.get(0);
  }
}
