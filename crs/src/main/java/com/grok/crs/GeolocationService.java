package com.grok.crs;

import org.springframework.stereotype.Service;

@Service
public interface GeolocationService {

	/**
	 * Makes a request to the user's geolocation enabled device for its {@link Geolocation}
	 * @param userId
	 * @return
	 */
	Geolocation getGeolocation(User user);
		
}
