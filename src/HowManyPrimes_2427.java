
import java.util.Scanner;

/*

Description
Let us remember the deﬁnition of a prime number: a positive integer number p greater than one is called a primer number if and only if it can be divided by exactly two positive integers: 1 and p. Given two positive integers a and b, your task is to determine the amount of prime numbers in the closed interval [a, b].
Input specification
The input may contain several test cases. Each test case is presented in a line of its own and contains two positive integer numbers a and b (2 <= a <= b <= 10^6). The input ends with a test case where a and b are both 0, and this case must not be processed.
Output specification
For each test case, your program has to print one line with the amount of unique prime numbers pi, where a <= pi <=  b.
Sample input
4 4
5 5
4 6
2 10
2 23
10 20
0 0
Sample output
0
1
1
4
9
4
 */
public class HowManyPrimes_2427 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int primes[] = new int[78501];
        boolean found[] = new boolean[1000001];
        int count = 0;
        
        for(int i = 2; i < 1000001; i++){
            if(found[i] == false){
                primes[count] = i;
                count++;
                for (int j = i*2; j < 1000001; j+=i) {
                    found[j] = true;
                }

            }               
        }
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            int num = 0;
            if(a==0 && b==0){
                break;                
            }

            while(a <= b){
                if(found[a] == false){
                    num++;
                }
                a++;
                
            }
                     
            System.out.println(num);
        }

        
        
    }
}
