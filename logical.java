package sakshi.com;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("Enter third Number");
		int c=sc.nextInt();
		
		
		
		if ((a < b) && (b == c)) {
             int d= a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
		

	}


