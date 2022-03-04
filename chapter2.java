package niuniudejavadaima;

import java.util.Scanner;

public class chapter2 {

	
//2-1 ComputerArea
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double radius = 20;
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
	}*/

//2-2	
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		System.out.println("The area for the circleof radius " + radius + " is " + area);
	}*/
	
	
//2-3
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average = (number1 + number2 + number3) / 3;
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
	}*/
	
	
	
//2-4
/*	public static void main(String[] args) {
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		System.out.println("The area for the circleof radius " + radius + " is " + area);
	}*/
	
	
//2-5
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}*/
	
	
//2-6
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}*/
	
	
	
//2-7
/*	public static void main(String[] args) {
      long totalMilliseconds=System.currentTimeMillis();
      long totalSeconds = totalMilliseconds / 1000;
      long currentSecond = totalSeconds % 60;
      long totalMinutes = totalSeconds / 60;
      long currentMinute = totalMinutes % 60;
      long totalHours = totalMinutes / 60;
      long currentHour = totalHours % 24;
      System.out.println("Current time is" + currentHour + " : " + currentMinute+" : " + currentSecond + " GMT ");
	}*/


//2-8	
/*	public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter purchase amount:");
       double purchaseAmount = input.nextDouble();
       double tax = purchaseAmount*0.06;
       System.out.println("Sales tx is $"+(int)(tax*100)/100.0);

	}*/


//2-9
/*	public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter annual interest rate, e.g.,7.25%:");
      double annualInterestRate = input.nextDouble();
      double monthlyInterestRate = annualInterestRate/1200;
      System.out.print("Enter number of years as an integer,e.g., 5:");
      int numberOfYears = input.nextInt();
      System.out.print("Enter loan amount, e.g., 120000.95:");
      double loanAmount = input.nextDouble();
      double monthlyPayment = loanAmount*monthlyInterestRate /(1-1/Math.pow(1 + monthlyInterestRate,numberOfYears*12));
      double totalPayment = monthlyPayment*numberOfYears*12;
      System.out.println("The monthly payment is $"+(int)(monthlyPayment * 100) / 100.0);
      System.out.println("The total payment is $"+(int)(totalPayment * 100) / 100.0);
	}*/

//2-10
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter an amount in double,for example,11.56:");
	   double amount = input.nextDouble();
	   int remainingAmount = (int)(amount*100);
	   int numberOfOneDollars = remainingAmount/100;
	   remainingAmount = remainingAmount%100;
	   int numberOfQuarters = remainingAmount/25;
	   remainingAmount = remainingAmount%25;
	   int numberOfDimes = remainingAmount/10;
	   remainingAmount = remainingAmount%10;
	   int numberOfNickels = remainingAmount/5;
	   remainingAmount = remainingAmount%5;
	   int numberOfPennies = remainingAmount;
	   System.out.println("Your amount "+amount+" consists of");
	   System.out.println("    "+numberOfOneDollars+" dollars");
	   System.out.println("    "+numberOfQuarters+" quarters");
	   System.out.println("    "+numberOfDimes+" dimes");
	   System.out.println("    "+numberOfNickels+" nickels");
	   System.out.println("    "+numberOfPennies+" pennies");
	}
}
