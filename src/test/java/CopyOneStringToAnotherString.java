public class CopyOneStringToAnotherString
{
  public static void main (String[]args)
  {
    String s = "Saravanan";
    int size=s.length();
    char x[]=s.toCharArray();
    char a[]=new char[size];
    int i=0;
    while(i != size){
        a[i]=x[i];
        i++;
    }
    System.out.println(a);
  }
}
