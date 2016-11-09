package com.grok.crs;

import javax.persistence.Column;
import javax.persistence.Entity;

public class Geolocation {

	private double latitude;
	private double longitude;
	private double altitude;
	private double accuracy;
	private double altitudeAccuracy;
	private double heading;
	private double speed;
	
	public Geolocation(double latitude, double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public double getAltitudeAccuracy() {
		return altitudeAccuracy;
	}

	public double getHeading() {
		return heading;
	}

	public double getSpeed() {
		return speed;
	}

}
