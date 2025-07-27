package com.qspider;

public class VehicleClass implements Car,Bike1{

	@Override
	public void brand() {
		System.out.println("this is vehicle brand");
			}
	@Override
	public void price() {
		System.out.println("this is vehicle price");
	}
	@Override
	public void color() {
		System.out.println("this is vehicle color");
	}
	@Override
	public void fuelType() {
		System.out.println("this is vehicle fuelType");
			}
	@Override
	public void cc() {
		System.out.println("This is CC");
	}
}
