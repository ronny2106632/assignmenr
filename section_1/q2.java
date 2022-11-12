import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the marks of the five units: ");

    double mark1 = input.nextDouble();

    double mark2 = input.nextDouble();

    double mark3 = input.nextDouble();

    double mark4 = input.nextDouble();

    double mark5 = input.nextDouble();

    double average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;

System.out.println("The average is " + average);

}

}