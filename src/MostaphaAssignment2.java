/*
 * Assessment: Assignment 02
 * Student Name: Mostapha Abdelaziz
 * Due Date: Oct 25, 2020
 * Description: Calculate the amount of paint and paint cans needed
 * Professor Name: Mohammad Patoary
 */

import java.util.Scanner;

public class MostaphaAssignment2 {

	public static void main(String[] args) {
		
		//declaring variables for employee and ft needed
		String employee;
		int ft;
		
		//setting the scanner to variable input
		Scanner input = new Scanner(System.in);
		
		//asking for employees name
		System.out.println("Enter employee name: ");
		employee = input.nextLine();
		
		//asking for the square feet
		System.out.println("Enter square feet needed as a whole number: ");
		ft = input.nextInt();
		
		//creating an object of order with the variables we have taken
		Order order1 = new Order(employee, ft);
		
		//printing the variable that returns
		System.out.println(order1.detailsOrder());
		
		//closing the scanner
		input.close();
	}

}
