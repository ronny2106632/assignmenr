
package java_methods;

import java.util.Scanner;

public class methods {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        if (num1 < num2 && num1 < num3)
            System.out.println("The smallest number is: " + num1);
        else if (num2 < num1 && num2 < num3)
            System.out.println("The smallest number is: " + num2);
        else 
            System.out.println("The smallest number is: " + num3);
        
        if (num1 > num2 && num1 > num3)
            System.out.println("The largest number is: " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("The largest number is: " + num2);
        else 
            System.out.println("The largest number is: " + num3);
        
        System.out.println(num1 + " is your largest and " + num3 + " is your smallest number.");
    }
}