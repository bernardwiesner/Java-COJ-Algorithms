
import java.util.Scanner;

public class AmateurMeteorologist_3935 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String last ="";
        int cloudy =0;
        
        int outcome = 0;
        for (int i = 0; i < d; i++) {
            String s = sc.next();
            
            
            if(s.equals("cloudy")){
                cloudy++;
            }
            if(i == 0 && s.equals("sunny")){
                outcome++;
            }
            
            if(last.equals("sunny") && s.equals("sunny")){
                outcome++;
            }
            else if(last.equals("rainy") && s.equals("rainy")){
                outcome++;
            }
            else if(cloudy >= 3 && s.equals("rainy")){
                outcome++;
                cloudy = 0;
            }
            else if(last.equals("cloudy") && s.equals("cloudy") && cloudy <= 3){
                outcome++;
            }
            
            if(!s.equals("cloudy") && cloudy > 0){
                cloudy = 0;
            }
            last = s;
            
        }
        System.out.println(outcome);
        
    }
    
}
