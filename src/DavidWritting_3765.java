
import java.util.HashMap;
import java.util.Scanner;

public class DavidWritting_3765 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String t = "abcdefghijklmnopqrstuvwxyz";
        HashMap m = new HashMap();
        String s = sc.next();
        
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == 'a' || t.charAt(i) == 'e' || t.charAt(i) == 'i' || t.charAt(i) == 'o' || t.charAt(i) == 'u'){
            m.put(t.charAt(i), 0);    
            }else{
            m.put(t.charAt(i),i+1);    
            }
           
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(m.get(s.charAt(i)).toString());
        }
        System.out.println(sum);
    }
}
