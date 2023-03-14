public class ReverseString
{
  public static void main (String[]args)
  {
    String s = "Saravanan";
    int size=s.length();
    //type1
    /*
    char x[]=s.toCharArray();
    char a[]=new char[size];
    int i=0;
    while(i != size){
        a[size-1-i]=x[i];
        i++;
    }
    System.out.println(s);
    System.out.println(a);
    */
    String rev="";
    for(int i=size-1; i>=0; i--){
        char c=s.charAt(i);
        rev=rev+c;
    }
    System.out.println(s);
    System.out.println(rev);
  }
}
