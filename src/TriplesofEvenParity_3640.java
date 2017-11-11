
import java.util.HashSet;
import java.util.Scanner;

public class TriplesofEvenParity_3640 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet hs = new HashSet();
        
        
        long arr_odd[] = new long[num+1];
        long arr_even[] = new long[num+1];
        long sum = 0;
        long sum2 = 0;
        long previous = 0;
        for (int i = 1; i <= num; i++) {
            
            sum = sum + i;
            sum2 = sum+previous;
            previous = sum2;
            arr_even[i-1] = sum2;
          
        }
        sum = 0;
        for (int i = 1; i <= num; i++) {
            
            sum = sum + i;
          
            arr_odd[i-1] = sum;
            
        }
        
        int even = 0;
        int odd = 0;
        long n = 0;
        for (int i = 0; i < num; i++) {
            String x = sc.next();
            switch(x.charAt(0)){
                case 'q':
                    countEven(hs, even, odd, arr_even, arr_odd);
                    break;
                case 'r':
                    n = sc.nextLong();
                    if(hs.contains(n)){
                        hs.remove(n);
                        if(n%2 == 0){even--;}else{odd--;}
                    }
                    
                    break;
                case 'i':
                    n = sc.nextLong(); 
                    if(!hs.contains(n)){
                        if(n%2 == 0){even++;}else{odd++;}
                        hs.add(n);
                    }
                    break;
            }
        }
    }
    
    public static void countEven(HashSet hs, int even, int odd, long[] arr_even, long[] arr_odd){
        if(even == 1 && odd >= 2){
            System.out.println(arr_odd[odd-2]);
            return;
        }
        
        long evenN = 0;
        long oddN = 0;
        if(even >= 3){
            evenN = arr_even[even-3];
        }
        if(odd >= 2){
            oddN = even*arr_odd[odd-2];
        }
       
        System.out.println(evenN+oddN);
    }
}
