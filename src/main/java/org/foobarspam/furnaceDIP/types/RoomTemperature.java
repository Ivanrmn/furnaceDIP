package org.foobarspam.furnaceDIP.types;

public class RoomTemperature {
	
	private double temperature = 0;
	
	private static RoomTemperature instance;
	
	private RoomTemperature(double temperature){
		this.temperature = 15;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment){
		this.temperature += increment;
	}
	
	public static RoomTemperature getInstance () {
		if(instance != null) {
			return instance;
			
		}else{
			instance = new RoomTemperature(15);
			return instance;
		}
	}
	private static void showMessage() {
		System.out.println("Temperatura" + instance);
	}

}
