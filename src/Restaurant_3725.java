
import java.util.Scanner;

/*

Sample input
2
2 2
6 9
Sample output
1
6
 */
public class Restaurant_3725 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            int smallest = l;
            int maximum_size = 0;
            if(b < l){
                smallest = b;
            }
            
            for (int j = 1; j <= smallest; j++) {
                int x = l/j;
                int y = b/j;
                
                if(l%j == 0 && b%j == 0){
                    maximum_size = x*y;
                }
                
            }
            System.out.println(maximum_size);
        }
        
    } 
}
