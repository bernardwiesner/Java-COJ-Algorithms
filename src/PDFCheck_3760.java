import java.util.Scanner;

/*

Sample input
3
9 4
11 7
6 6
Sample output
YES
NO
YES

 */
public class PDFCheck_3760 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum_d1 = 0;
            int sum_d2 = 0;           

            for (int j = 1; j <= a/2; j++) {
                if(a%j==0){
                    sum_d1+=j;
                }
            }
            for (int j = 1; j <= b/2; j++) {
                if(b%j==0){
                    sum_d2+=j;
                }
            }            
            
            System.out.println(sum_d1 + " " + sum_d2);
            if(sum_d1 == b || sum_d2 == a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            

            
        }
        
    }
}
