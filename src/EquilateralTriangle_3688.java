
import java.util.Scanner;

public class EquilateralTriangle_3688 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            double D1 = sc.nextDouble();
            double D2 = sc.nextDouble();
            
            double smaller = 0;
            double bigger = 0;
            if(D1 < D2){
                smaller = D1;
                bigger = D2;
            }else{
                smaller = D2;
                bigger = D1;
            }
            
            
            double b = smaller*2+bigger;
            double a = b*Math.tan(Math.toRadians(30));
            double c = Math.sqrt((bigger*bigger)+(a*a));
            double base = c/2;
            double height = Math.sqrt((c*c)-(base*base));
            double area = (c*height)/2;
            System.out.println(area);
        }
        
    }
    
}
