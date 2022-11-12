public class AverageMarks {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter marks for Java programming: ");
int java = input.nextInt();

System.out.println("Enter marks for networking: ");
int networking = input.nextInt();

System.out.println("Enter marks for maths: ");
int maths = input.nextInt();

int average = (java + networking + maths) / 3;

System.out.println("The average is: " + average);
  }
}