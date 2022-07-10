package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean b =false;
        if(number==0||number==1){
            System.out.println(number +" is not prime number");
        }
        else
        {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    b = true;
                    break;
                }
            }
        }
        if(!b) {
            System.out.println(number +" is a prime number");
        }else{
            System.out.println(number +" is not a prime number");
        }
    }
}  	