public class ConvertLowerToUpperCase {
    public static void main(String[] args){
        String s="saravanan tester";
        int size=s.length();
        char x[]=s.toCharArray();
        int i=0;
        while (i != size) {
            //a=97,A=65   b=98,B=66
            if(x[i] !=' '){
            x[i]=(char)(x[i]-32);
            }
            i++;
        }
        System.out.println(x);
    }
}