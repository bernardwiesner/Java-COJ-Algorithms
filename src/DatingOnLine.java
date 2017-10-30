import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
//acm regional competition 2016 - Wrong answer
public class DatingOnLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();            
            
        }
        
        Deque<Integer> d = new ArrayDeque<>();
        Arrays.sort(arr);
        int right = 0;
        int left = 0;
        for(int i = 0; i< n; i++){
            
            if(left < right){
            d.addFirst(arr[i]);           
            left += arr[i];

            }else{
            d.addLast(arr[i]); 
            right += arr[i];
            
            }

            
        } 
        
        ArrayList<Integer> al = new ArrayList<>(d);
        for(int i : al){
            System.out.println(i);
        }
        double area_total = 0;
        double angle = 360/n;
        
        
        for(int i = 0; i< n; i++){
            
            int side1 = al.get(i);
            int side2;
            if(i == n-1){
                side2 = al.get(i);
            }else{
                side2 = al.get(i+1);
            }
            int side = side1;
            int base = side2;
            
            
            if(side2 < side1){
                side = side2;
                base = side1;
            }
            
            double a = Math.sin(Math.toRadians(angle))*side;
            
            double area = a*base/2;
            System.out.println(area);
            area_total += area;
            
        }        
        System.out.printf("%.3f%n",area_total);
    }
}
