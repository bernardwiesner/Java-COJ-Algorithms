import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class UniversityGifts_3857 {

    public static void main(String[] args) {
        
        
        ArrayList<BigInteger> al = new ArrayList();
        al.add(BigInteger.valueOf(0)); //0
        al.add(BigInteger.valueOf(0)); //1
        al.add(BigInteger.valueOf(1)); //2
        BigInteger cons;
        for (int i = 3; i <= 1000000; i++) {
//            int range = i-1;
//            cons = al.get(range).multiply(BigInteger.valueOf(range));
//            
//            int top = (int)Math.sqrt(i);
//            System.out.println(cons.toString());
            
            
            al.add(((al.get(i-2).add(al.get(i-1))).multiply(BigInteger.valueOf(i-1))).mod(BigInteger.valueOf(1000000007)));
            
            
            
        }
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            System.out.println(al.get(n).toString());
        }
        
        
    }
    
}
