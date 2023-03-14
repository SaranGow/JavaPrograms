import java.util.*;
import java.util.Map.Entry;
public class Mapp {
    public static void main(String args[]) {
      Map<String, Boolean> mp=new HashMap<>();
      mp.put("Name", true);
      mp.put("mail", false);
      mp.put("mobile", true);
       mp.put("mobile", false);
      mp.put("UserType", false);
   Set<Entry<String, Boolean>> entrySet = mp.entrySet();
       for(Entry<String, Boolean> individual:entrySet){
           System.out.println(individual);
       }
}
}
