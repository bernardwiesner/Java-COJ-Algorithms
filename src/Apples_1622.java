
import java.util.ArrayList;
import java.util.Scanner;

public class Apples_1622 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        while (sc.hasNextInt()) {
            
            int bags = sc.nextInt();            

            int c = 0;
            ArrayList al = new ArrayList();
            
            for (int j = 0; j < bags; j++) {                                            
                al.add(sc.next());
            }
            
            for (int j = 0; j < bags; j++) {
                int removed = Integer.parseInt(al.remove(bags-1).toString());
               
                int sum = 0;
                for (int k = 0; k < bags-1; k++) {
                    sum += Integer.parseInt(al.get(k).toString());
                    
                }
                
                if(sum % 2 == 0){
                    c++;
                }
                al.add(0, removed);
            }
            System.out.println(c);
            
        }
        
        
        
    }
    
}
