
import java.util.Scanner;

public class GroupReverse_1177 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){

            int g = sc.nextInt();
            if(g == 0){
                break;
            }
            String st = sc.next();
            int letters = st.length()/g;

            String temp = "";
            String result = "";
            for (int i = 0; i < st.length(); i++) {
                temp += st.charAt(i);
                if((i+1)%letters == 0){
                    
                    result += new StringBuilder(temp).reverse().toString();
                    temp = "";
                }
            }
            System.out.println(result);
            
        }
        
        
    }
}
