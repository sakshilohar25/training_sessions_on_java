package sakshi.com;

import java.util.Scanner;

public class operater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		
		System.out.println("first no+Second no= "+(a+b));
		System.out.println("first no-Second no= "+(a-b));
		System.out.println("first no*Second no= "+(a*b));
		System.out.println("first no/Second no= "+(a/b));
		System.out.println("first no%Second no= "+(a%b));
		System.out.println("first no<Second no= "+(a<b));
		System.out.println("first no>Second no= "+(a>b));
		System.out.println("first no<=Second no= "+(a<=b));
		System.out.println("first no>=Second no= "+(a>b));
		System.out.println("first no==Second no= "+(a==b));
		System.out.println("first no!=Second no= "+(a!=b));
		System.out.println("first no= "+(a++));
		System.out.println("first no= "+(a--));
		System.out.println("first no "+(++a));
		System.out.println("first no "+(--a));
		

	}

}
