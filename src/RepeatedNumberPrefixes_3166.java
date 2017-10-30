
import java.util.Arrays;
import java.util.Scanner;

/*

Sample input
asad
asasatt
Sample output
3 4 2 0

Does not work in Coj
 */
public class RepeatedNumberPrefixes_3166 {
    
    public static char[] reverse(char[] x)
    {
        char[] s = x.clone();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return s;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        String answer = "";
            
               
        int length = s2.length();
        
      
       
        for (int i = 0; i < s1.length(); i++) {
            
            
            int c = 0;
            char[] b = new char[i+1];
            s1.getChars(0, i+1, b, 0);

            char arr[] = new char[i+1];
            
            
            char[] r = reverse(b);
            length--;
            
            for (int j = 0; j <= length; j++) {               
                s2.getChars(j, j+i+1, arr, 0);
                
                if(Arrays.equals(b, arr) || Arrays.equals(arr, r)){
                    c++;
          
                }          
            }
            answer += c + " ";
            
            
            
        }
        System.out.println(answer);
    
    }
}
