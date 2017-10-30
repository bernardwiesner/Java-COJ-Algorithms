import java.util.Scanner;
import java.util.StringTokenizer;
//15.59 4.00 9.00 Gives wrong answer in Coj
public class DanielGeometry_1726{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
                        
        
        do{
            try{
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            double Area = Double.parseDouble(st.nextToken());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            double a = 2*Area/y;
        
            double B = Math.toDegrees(Math.asin(a/x));
          
            double z = Math.sqrt(y*y+x*x-2*y*x*Math.cos(Math.toRadians(B)));
       
            double C = Math.toDegrees(Math.asin(x*Math.sin(Math.toRadians(B))/z));
          
            double A = 180 - B - C;
       
            B = B/2;
        
            double D = 180 - B - A;
         
            double m = (Math.sin(Math.toRadians(A))*x)/Math.sin(Math.toRadians(D));
            m = m/2;
           
            a = m*Math.sin(Math.toRadians(B));
      
            double area = a*x/2;
        
            System.out.println(String.format("%.0f", area));
            
            }catch(RuntimeException e){
                    break;
                    }
        }while(sc.hasNextLine());
        
        
    }
}
