import java.util.Scanner;

public class OddOrEven
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    //Type1
    /*
    if (n % 2 == 0)
      {
	System.out.println (n + " is even Number");
      }
    else if (n % 2 != 0)
      {
	System.out.println (n + " is odd Number");
      }
     */
    //Type2
    String result=n%2==0?" Is Even":"Is Odd";
    System.out.println(result);
  }
}