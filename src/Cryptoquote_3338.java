import java.util.HashMap;
import java.util.Scanner;

/*
2
HPC PJVYMIY
BLMRGJIASOPZEFDCKWYHUNXQTV
FDY GAI BG UKMY
KIMHOTSQYRLCUZPAGWJNBVDXEF
 */
public class Cryptoquote_3338 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap map = new HashMap();
        for (int i = 0; i < alpha.length(); i++) {
            map.put(alpha.charAt(i), i);
        }
        
        for (int i = 0; i < n; i++) {
            
            String s1 = sc.next();
            s1 += sc.nextLine();
            String s2 = sc.next();
            s2 += sc.nextLine();
            String r = "";
            
            
            for (int j = 0; j < s1.length(); j++) {

                try{
                    
                    int position = Integer.parseInt(map.get(s1.charAt(j)).toString());           
                    r += s2.charAt(position);    
                }catch(NullPointerException e){
                    r += " ";
                }
                
            }
            System.out.println(i+1 + " " + r);
        }
        
    }
}
