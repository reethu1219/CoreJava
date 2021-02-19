package test1;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of a square");
		Scanner sc=new Scanner(System.in);
		double side = sc.nextDouble();
		double result = side*side;
		System.out.println(result);
	}

}
