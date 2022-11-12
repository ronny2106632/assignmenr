import java.util.Scanner; 

public class LeapYear {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a year: ");
int year = input.nextInt();

boolean isLeapYear = 

(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

if (isLeapYear)
System.out.println(year + " is a leap year");
else
System.out.println(year + " is not a leap year");
  }
}

public class AreaOfTriangle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the base of the triangle: ");
int base = input.nextInt();

System.out.print("Enter the height of the triangle: ");
int height = input.nextInt();

int area = computeArea(base, height);

System.out.println("The area of the triangle is " + area);
  }

public static int computeArea(int base, int height) {
return (base * height) / 2;
  }
}