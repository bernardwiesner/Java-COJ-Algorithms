
import java.math.BigInteger;
import java.util.Scanner;
/*

Sample input
3
10 2
6 5
23 8
Sample output
111
9331
870574954
 */
public class PowerSum_2061 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger module = new BigInteger("1000000007");
        for (int i = 0; i < num; i++) {
            
            BigInteger x = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger().add(BigInteger.ONE);
            if(x.intValue() == 1){
                System.out.println(n);
                
            }else{
            
            BigInteger numerator = x.modPow(n ,module).subtract(BigInteger.ONE);
            BigInteger result = numerator.multiply((x.subtract(BigInteger.ONE).mod(module)).modInverse(module));
            System.out.println(result.mod(module));
            
     
            }
        }
        
        
    }
}
