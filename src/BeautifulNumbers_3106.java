
import java.util.Scanner;

public class BeautifulNumbers_3106 {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        String num = num1 + "" + num2;
        
        double divide = (double)num.length()/2;
      
        boolean cond = false;

        if(num.length()%2 == 0){
            String st1 = num.substring(0, (int)divide);
          
            String st2 = num.substring((int)divide);
            st2 = new StringBuilder(st2).reverse().toString();
            
            if(st1.equals(st2)){
                cond = true;
            }
        }else{
            String st1 = num.substring(0, (int)divide);
           
            String st2 = num.substring((int)divide+1);
            st2 = new StringBuilder(st2).reverse().toString();
            
            if(st1.equals(st2)){
                cond = true;
            }
        }        
       
        if(cond == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
