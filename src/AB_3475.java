
import java.util.Scanner;

public class AB_3475 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        System.out.println((a*b*Math.sin(a*a))+a*b*Math.cos(a));
        
    }
}
