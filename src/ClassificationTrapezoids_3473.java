
import java.util.Scanner;

/*

Sample input
45 90 90 135
Sample output
right
3473
 */
public class ClassificationTrapezoids_3473 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        
        int ninety = 0;
        
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            if(n == 90){
                ninety++;
            }
            
            
            arr[i] = n;
        }
        
        
        if(ninety == 2){
            System.out.println("right");
        }else if((arr[0] == arr[1] && arr[2] == arr[3] && arr[0] != 90) || (arr[0] == arr[2] && arr[1] == arr[3] && arr[0] != 90) || (arr[0] == arr[3] && arr[1] == arr[2]) && arr[0] != 90){
            System.out.println("isosceles");
        }else{
            System.out.println("none of the previous");
        }
        
        
        
    }
}
