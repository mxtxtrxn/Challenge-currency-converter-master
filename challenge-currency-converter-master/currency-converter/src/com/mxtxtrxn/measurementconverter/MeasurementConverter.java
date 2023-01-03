package com.mxtxtrxn.measurementconverter;

public class MeasurementConverter {
	//inches in centimeters
	private static double inches = 2.54;
	//feet in meters
	private static double feet = 0.3048;
	//miles in kilometers
	private static double miles = 1.609344;
	
	
	public double inchesToCentimeters(double value) {
		return value * inches;
	}
	
	public double feetToMeters(double value) {
		return value * feet;
	}
	
	public double milesToKilometers(double value) {
		return value * miles;
	}
}
