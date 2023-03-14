public class PalindromeWithSpacesAndUpperLowerCombination
{
  public static void main (String[]args)
  {
    String s = "too Hot to Hoot";
    //System.out.println(s);
    s=s.replace(" ","");
    s=s.toLowerCase();
    //System.out.println(s);
    char y[]=s.toCharArray();
    int size=s.length();
    char a[]=new char[size];
    int i=0;
    while(i != size){
        a[size-1-i]=y[i];
        i++;
    }
   // System.out.println(y);
   System.out.println(a);
   int j=0;
   while(j != size){
       if(a[j]!=y[j]){
           System.out.println("Not Polindrome");
           System.exit(0);
       }
       else{
           j++;
           continue;
       }
   }
    System.out.println("palindrome");
  }
}
