
import java.util.Scanner;

/**
pancake flippers
 */
public class CodeJam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        
        for (int k = 0; k < c; k++) {
            
        
            String num = (sc.next());
            StringBuilder pretty = new StringBuilder();
            //String pretty = "";
            boolean same = true;
            
            for (int i = 0; i < num.length()-1; i++) {

                if(num.charAt(i) > num.charAt(i+1)){
                                           
                       
                    if(i > 0 && num.charAt(i) == num.charAt(i-1)){
                        pretty = new StringBuilder(pretty.toString().replace(num.charAt(i), '9'));
                        pretty.setCharAt(num.indexOf(num.charAt(i)), (char)((Character.getNumericValue(num.charAt(i))-1)+'0'));     
                       
                        for (int j = i; j < num.length(); j++) {
                            pretty.append("9");
                        }
                        same = false;
                        break;                        
                    }

                        pretty.append(String.valueOf(Character.getNumericValue(num.charAt(i))-1));
                    
                    for (int j = i; j < num.length()-1; j++) {
                        pretty.append("9");

                    }
                    same = false;
                    break;
                }
                pretty.append(String.valueOf(num.charAt(i)));
            }
            if(same == true){
                System.out.println("Case #"+(k+1)+": "+num);
            }else{
                
                System.out.println("Case #"+(k+1)+": "+Long.parseLong(pretty.toString()));
            }
        }
    }
}
