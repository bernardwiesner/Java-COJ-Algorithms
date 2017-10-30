
import java.util.Arrays;
import java.util.Scanner;

public class BeautyContest_2145 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int[] scores = new int[10];
            for (int j = 0; j < 10; j++) {
                scores[j] = sc.nextInt();
                
            }
            Arrays.sort(scores);
            for (int j = 1; j < 9; j++) {
          
                sum  += scores[j];
            }
            System.out.println(i+1 + " "  +sum);
            sum = 0;
        }
        
        
        
    }
}
