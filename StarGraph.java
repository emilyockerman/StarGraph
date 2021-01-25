/*
* StarGraph.java
* Author: Emily Ockerman
* Submission Date: October 10, 2018
*
* Purpose: to graph x and y values as little asterisk marks :)
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* CSCI 1301: Project 1 Page 3
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/


import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt for length of array
		System.out.print("Please enter the number of x values to process: ");
		int n = input.nextInt();
		if (n <= 0)
		{
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		//prompt for minimum x value
		System.out.print("Enter a minimum value for x: ");
		double minVal = input.nextDouble();
		//prompt for increment value
		System.out.print("Enter the amount to increment x: ");
		double increment = input.nextDouble();
		if (increment <= 0)
		{
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		//creation of arrays
		double[] x = new double[n];
		double[] y = new double[n];
		
		
		//loop to assign value to each array member
		for (int s = 1; s < n; s++)
		{
			x[0] = minVal;
			x[s] = x[s-1] + increment;
			y[0] = 20.0 * Math.abs(Math.sin(x[0]));
			y[s] = 20.0 * Math.abs(Math.sin(x[s]));
		}
		
		//loop to print out values
		System.out.println("\nValues");
		for (int s = 0; s < n; s++)
		{
			System.out.printf("\nx: %1.3f", x[s]);
			System.out.printf( "  y: %1.3f", y[s]);
		}
		
		//loop to print out graph
		System.out.println("\n\nGraph");
		for (double elem: y)
		{
			System.out.print("\n:");
			elem = Math.floor(elem);
			if (elem > 0)
			{
				for (int i = 0; i < elem; i++)
				System.out.print("*");
			}
		}
	}

}
