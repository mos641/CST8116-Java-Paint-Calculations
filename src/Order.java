/*
 * Assessment: Assignment 02
 * Student Name: Mostapha Abdelaziz
 * Due Date: Oct 25, 2020
 * Description: Calculate the amount of paint and paint cans needed
 * Professor Name: Mohammad Patoary
 */

public class Order {
	
	//declaring the variables
	private String employee;
	private int ft;
	private double litres;
	private int cans;
	
	//default constructor
	public Order() {
		employee = "n/a";
		ft = -1;
		litres = -1;
		cans = -1;
	}
	
	//overloaded constructor
	public Order(String employee, int ft) {
		this.employee = employee;
		this.ft = ft;
		calculate();
	}
	
	//work method
	private void calculate() {
		litres = .01 * ft;
		cans = (int)Math.ceil(litres/4);
	}
	
	//making a set method for employee name
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	//making a get method for employee name
	public String getEmployee() {
		return employee;
	}
	
	//making a set method for ft
	public void setFt(int ft) {
		this.ft = ft;
	}
	
	//making a get method for ft
	public int getFt() {
		return ft;
	}
	
	//get method for litres
	public double getLitres() {
		calculate();
		return litres;
	}
	
	//get method for cans
	public int getCans() {
		calculate();
		return cans;
	}
	
	//storing and returning the processed order in a string
	public String detailsOrder() {
		String order;
		calculate();
		order = "Paint needed for " +ft+ " square ft \n You will need " +litres+ " litres \n Which is " +cans+ " can(s) of paint \n Order processed by: " +employee;
		return order;
	}

}
