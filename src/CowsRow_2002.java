import java.util.ArrayList;
import java.util.Scanner;

/*
9 2 7 3 7 7 3 7 5 7
2
7
3
7
7
3
7
5
7
Sample output
4

 */
public class CowsRow_2002 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList al = new ArrayList();
        ArrayList al_unique = new ArrayList();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            al.add(num);
           
            if(!al_unique.contains(num)){
                al_unique.add(num);
            }
        }
        
        int longest = 0;
        for (int i = 0; i < al_unique.size(); i++) {
           ArrayList al2 = new ArrayList();
           for (Object item : al) al2.add(item);
           
           int x = Integer.parseInt(al_unique.get(i).toString());
           
            while(al2.contains(x)){
                
                al2.remove(al2.indexOf(x));
                
                
            }

            int c = 0;
            for(int a = 0; a < al2.size()-1; a++) {
           
                
                if(al2.get(a).equals(al2.get(a+1))){
                    if(c == 0){
                        c++;
                    }
                    c++;
                  
                }else{
                    if(longest < c){
                        longest  = c;
                      
                    }
                    c = 1;
                }
                if(longest < c){
                    longest = c;
                }        
                
            }
  
        }
        System.out.println(longest);
        
    }
}
