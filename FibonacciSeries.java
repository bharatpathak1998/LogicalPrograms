package logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a count: ");
        int a = sc.nextInt();

        int num1 = 0, num2 = 1, num3, i;
        System.out.print(num1 + " " + num2);
        for (i = 2; i < a; i++)
        {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }    

    }

}
