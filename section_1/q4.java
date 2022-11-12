public class Main
{
public static void main(String[] args)
{
int i;
System.out.println("The multiples of 2, 3 and 7 within the range 71 to 150 are given below");
for(i = 71; i <= 150; i++)
{
if((i % 2 == 0) || (i % 3 == 0) || (i % 7 == 0))
{
System.out.print(i + " ");
}
}
}
}