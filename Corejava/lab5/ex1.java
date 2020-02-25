package lab5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		//Write a java program that simulates a traffic light. The program lets the user select one of three lights: 
		//red, yellow, or green with radio buttons. On entering the choice, 
		//an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is

		System.out.println("Select one of the following :");
		System.out.println("1--red\n 2--yellow\n 3--green");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("ready");
			break;
		case 3:
			System.out.println("go");
			break;
		default:
			System.out.println("select correctly");
			break;
		}
		
	}

}
