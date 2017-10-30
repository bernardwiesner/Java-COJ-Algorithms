import java.util.Scanner;

public class Keks_2806 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        StringBuilder s = new StringBuilder(sc.next());
        
        int c = 0;
        
            while(true){
                if(Character.getNumericValue(s.charAt(c)) < Character.getNumericValue(s.charAt(c+1))){
                    s.deleteCharAt(c);
                    k--;

                    if(k == 0){
                        System.out.println(s);
                        return;
                    }
                    if(c > 0){
                        while(true){
                            if(Character.getNumericValue(s.charAt(c)) > Character.getNumericValue(s.charAt(c-1))){
                                s.deleteCharAt(c-1);
                                k--;
                                
                                if(k == 0){
                                    System.out.println(s);
                                    return;
                                }
                                if(c > 1){
                                    c--;
                                }
                                
                            }else{
                                break;
                            }
                        }
                    } 
                    
                }else{
                    c++;
                }            

               
               if(s.length() <= c+1){
                   break;
               }
            }                
        while(k > 0){
            s.deleteCharAt(s.length()-1);
            k--;
        }        
        System.out.println(s);
    }
}
