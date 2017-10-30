
import java.util.Scanner;

public class RegularOctagon_2853 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
        double c = sc.nextDouble();
        if(c == 0){
            break;
        }
        double h = c/2;
        double diagonal = h/Math.sin(Math.toRadians(45));
        double base_triangle = c-diagonal;
        double area_triangles = ((base_triangle*base_triangle)/2)*4;
        double area_octagon = (c*c)-area_triangles;
        
        double area_final = Math.round(area_octagon*1000d)/1000d;
        System.out.println(String.valueOf(area_final));
        
        //or use 
        //double area_octagon = 2*(Math.sqrt(2)-1)*Math.pow(c, 2); //2*(sqroot(2)-1)*(S^2)
        }
    }
}

