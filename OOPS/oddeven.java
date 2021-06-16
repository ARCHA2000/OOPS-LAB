import java.util.Scanner;
class oddeven
{
   public static void main(String args[])
   {
      int n;
      Scanner s = new Scanner(System.in);
      System.out.println("enter a digit:");
      n = s.nextInt();
      if(n % 2 == 0)
         System.out.println("number is even");
      else
         System.out.println("number is odd:");
    }
}