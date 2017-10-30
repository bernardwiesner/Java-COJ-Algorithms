
import java.util.Scanner;


public class AutomaticCheckingMachine_3056 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().replace(" ", ""));
        int b = Integer.parseInt(sc.nextLine().replace(" ", ""));
        
        if(a + b == 11111){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        
    }
}
