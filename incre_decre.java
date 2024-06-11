package sakshi.com;

import java.util.Scanner;

public class incre_decre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        System.out.println("Original first number = " + a);
        System.out.println("Post-increment (a++): " + (a++));
        
        System.out.println("After post-increment, first number = " + a);
        System.out.println("Post-decrement (a--): " + (a--));
        
        System.out.println("After post-decrement, first number = " + a);
        System.out.println("Pre-increment (++a): " + (++a));
        
        System.out.println("After pre-increment, first number = " + a);
        System.out.println("Pre-decrement (--a): " + (--a));
        
        System.out.println("After pre-decrement, first number = " + a);
        
        
    }
}
