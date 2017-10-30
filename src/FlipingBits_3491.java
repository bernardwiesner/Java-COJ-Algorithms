import java.util.Scanner;

/*

You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).
Input specification
The first line of the input contains the list size 1 <= T <= 100 , which is followed by T lines, each line having an integer N (0 <= N < 2^32) from the list.
Output specification
Output one line per element from the list with the requested result.
Sample input
3
2147483647
1           0000000001  ->   1111111110
0
Sample output
2147483648
4294967294
4294967295
 */
public class FlipingBits_3491 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){         
            long n = sc.nextLong();
            StringBuilder s = new StringBuilder(String.valueOf(Long.toBinaryString(n)));

            while(s.length() < 32){
                s.insert(0,"0");
            }

            for(int j = 0; j < 32; j++){
                if(s.charAt(j) == '1'){
                    s.setCharAt(j, '0');
                }else{
                    s.setCharAt(j, '1');
                }
            }

            System.out.println(Long.parseLong(s.toString(),2));
            long l = (n ^ 0xffffffffL);
            System.out.println(l);
        }
        
    }
}
