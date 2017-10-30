import java.util.Arrays;
import java.util.Scanner;

public class MedianLetters_3770 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s1 = sc.next().toCharArray();
        
        Arrays.sort(s1);
        System.out.println(s1);
        System.out.println(s1[n/2]);
        
    }
}
