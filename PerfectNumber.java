package logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
		
	System.out.print("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	    
	int number = sc.nextInt();
	int sum = 0;
	int i = 1;
	    
	while (i <= number / 2) {
	if (number % i == 0) {
	    sum = sum + i;
	}
	    i++;
	}
	if (sum == number) {
	    System.out.println(number + " is a perfect number.");
	}
	else
	{
            System.out.println(number + " is not a perfect number.");
        }
    }
}