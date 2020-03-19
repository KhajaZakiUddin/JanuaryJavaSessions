package com.javasessions;

public class LargestofFourNumbers {

	public static void main(String[] args) {
	
		//Finding the largest out of the given four integers using If...else if conditional statements
		int x=100;
		int y=200;
		int z=30;
		int t=500;
		
		if(x>y && x>z && x>t){
			System.out.println("X is the largest Number");
		}
		else if(y>z && y>t){
			System.out.println("y is the largest Number");
		}
		else if(z>t){
			System.out.println("Z is the largest Number");
		}
		else
			System.out.println("t is the largest Number");
	}

}
