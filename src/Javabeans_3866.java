import java.util.Scanner;

public class Javabeans_3866 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int n = sc.nextInt();
            int c = 1;
            for (long j = 1; j < 2147483648L; j*=2) {
                if(n < j*2){
                    System.out.println(c);
                    break;
                }
                c++;
            }
            
        }        
    }



    
}
