
import java.math.BigInteger;
import java.util.Scanner;

public class TheEmbarrassedCryptographer_2320 {
    public static void main(String[] args) {
        
        int number = 2000000;
        boolean[] primes = new boolean[number+1];
        int top = (int)Math.sqrt(number);
        for (int i = 2; i <= top; i++) {
            if(primes[i] == false){
                for (int j = i*i; j <= number; j+=i ) {
                    primes[j] = true;
                    
                }
                
            }
        }
        
        int[] prime = new int[148933];
        int c = 0;
        for (int i = 2; i < primes.length; i++) {
            if(primes[i] == false){
                prime[c] = i; 
                c++;
            }
        }
        Scanner sc = new Scanner(System.in);
        while(true){
            
            BigInteger K = sc.nextBigInteger();
            int L = sc.nextInt();
            if(K.equals(BigInteger.ZERO) && L == 0){
                break;
            }
            for (int i = 0; i < prime.length; i++) {
                if(prime[i] > 1000000){
                    System.out.println("GOOD");
                    break;
                }
                if(K.mod(BigInteger.valueOf(prime[i])).equals(BigInteger.ZERO)){
                    
                    if(prime[i] < L){
                        System.out.println("BAD "+prime[i]);

                    }else{
                        System.out.println("GOOD");
                    }
                    break;
                }
            }
        }
            
    }
}
