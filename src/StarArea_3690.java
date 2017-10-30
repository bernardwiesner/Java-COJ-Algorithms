
import java.util.Scanner;

public class StarArea_3690 {
    public static void main(String[] args){
                
        Scanner sc = new Scanner(System.in);
        
        while(true){
            double r = sc.nextDouble();
            double n = sc.nextDouble();
            
            if(r == 0 && n == 0){
                break;
            }            
            double degree1_A = 360/n;
            double degree1_B = (180-degree1_A)/2;
            double degree2_B = 180 - 90 - degree1_B;
            double degree2_A = 180 - (degree2_B*2);
            double side_agon_A = (r*Math.sin(Math.toRadians(degree1_A)))/Math.sin(Math.toRadians(degree1_B));
            double side_agon_B = (side_agon_A*Math.sin(Math.toRadians(degree2_B)))/Math.sin(Math.toRadians(degree2_A));
            double area1_arc = r*r*(degree1_A*3.1415927/360);
            double area1_seg = (r*r*Math.sin(Math.toRadians(degree1_A)))/2;
            double area_arc = area1_arc - area1_seg;
            
            double area_triangle = (side_agon_B*side_agon_B*Math.sin(Math.toRadians(degree2_A)))/2;
                                   
            double area_minus = area_triangle + area_arc;
                       
            double area_circle = 3.1415927*r*r;
            
            double area_star = area_circle - area_minus*n;
            
            System.out.println(area_star);

        }
        
        
        
    }
}
