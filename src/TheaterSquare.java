
import java.util.Scanner;
//codeforces
public class TheaterSquare {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();        
        double a = sc.nextDouble();
        
        
        double r1 = Math.ceil(n/a);
        double r2 = 0;
        
        
        r2 = Math.ceil(m/a-1);
        
        long r3 =(long)(r1*r2);
        long res = (long)(r3+r1);
        
        System.out.println(res);
    }
    
}