import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("The number of characters in your surname is " + surname.length());
        if(age % 2 == 0){
            System.out.println("Your age is an even number");
        }
        else{
            System.out.println("Your age is an odd number");
        }
    }
}