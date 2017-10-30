
import java.util.Scanner;


public class PancakeFlipper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        for (int f = 0; f < c; f++) {
            StringBuilder S = new StringBuilder(sc.next());
            int K = sc.nextInt();
            int fliped = 0;
            boolean impossible = false;

            while(S.toString().contains("-")) {

                int i = S.indexOf("-");
                    if(i <= S.length()-K){

                        for (int j = 0; j < K; j++) {
                            if(S.charAt(i) == '-'){
                                S.setCharAt(i, '+');
                            }else{
                                S.setCharAt(i, '-');
                            }
                            i++;                       

                        } 
                        fliped++;
                    }else{
                        if(i+1-K < 0){
                            impossible = true; 
                            break;
                        }
                        for (int j = 0; j < K; j++) {
                                if(S.charAt(i) == '-'){
                                    S.setCharAt(i, '+');
                                }else{
                                    S.setCharAt(i, '-');
                                }

                                i--;                       

                            }   
                        fliped++;
                        impossible = true;
                        break;
                    }           
            }    
            if(impossible == true){
                System.out.println("Case #"+(f+1)+": "+"IMPOSSIBLE");
            }else{
                System.out.println("Case #"+(f+1)+": "+fliped);
            }
        
        }
    }

    
}
