package Encapsulation;

import java.util.ArrayList;

public class User {

	public String name;
	public int  age;
	private double salary;
	private ArrayList<String> deviceList;

	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public ArrayList<String> getDeviceList() {
		return deviceList;
	}
	public void setDeviceList(ArrayList<String> deviceList) {
		this.deviceList = deviceList;
	}
	
	
}
