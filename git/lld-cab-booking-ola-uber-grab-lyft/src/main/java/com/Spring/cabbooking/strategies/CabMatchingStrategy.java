package com.Spring.cabbooking.strategies;

import java.util.List;

import com.Spring.cabbooking.model.Cab;
import com.Spring.cabbooking.model.Location;
import com.Spring.cabbooking.model.Rider;

public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
