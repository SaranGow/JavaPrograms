
public class SwappingTwoNumbers
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int a=10, b=20;
        System.out.println("Before Swapping a="+a+", b="+b+".");
        //Approch 1
        /*
        int t=a;
        a=b;
        b=a;
        */
        //Approch 2
        /*
        a=a+b;//30
        b=a-b;//10
        a=a-b;//20
        */
        //Approch 3
        
        a=a*b;
        b=a/b;
        a=a/b;
        
        System.out.println("After Swapping a="+a+", b="+b+".");
    }
}
