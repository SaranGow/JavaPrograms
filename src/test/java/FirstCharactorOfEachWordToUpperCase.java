public class FirstCharactorOfEachWordToUpperCase
{
  public static void main (String[]args)
  {
    String s = "saravanan java selenium tester";
    int size = s.length ();
    char x[] = s.toCharArray ();
      x[0] = (char) (x[0] - 32);
    int i = 1;
    while (i != size)
      {
	if (x[i] == ' ')
	  {
	    x[i + 1] = (char) (x[i+1] - 32);
	  }

	i++;
      }
    System.out.println (x);
  }
}
