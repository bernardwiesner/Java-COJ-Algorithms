import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class LeftRight_3683{
    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        TreeSet tree = new TreeSet();
        tree.add(0); tree.add(1000000);
        
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            
            int right = (int)tree.ceiling(n);
            if(right == n){
                System.out.println(n + " " + n);
                continue;
            }
            int left = (int)tree.floor(n);
            System.out.println(left + " " + right);
            tree.add(n);
        }
        
    }    
    
}
