package com.grok.crs;

import org.springframework.stereotype.Service;

@Service
public interface CarService {

	Car requestCar(String userId, Geolocation geolocation);
}
