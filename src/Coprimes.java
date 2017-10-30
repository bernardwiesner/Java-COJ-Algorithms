
import java.util.Scanner;

public class Coprimes {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] primos = new int[10];
        
        for(int i = 1; i <= a; i++){
            int primo = 0;
            int count =0;
            if(a%i==0 ){
                for(int j = 1; j <= i; j++){
                    if(i%j==0){
                        count++;
                    }
                    
                }
                
            }
            if(count == 2){
                primo = i;
                System.out.println(i);
            }
            primos[i-1] = primo;
        }
        
        
    }
}
