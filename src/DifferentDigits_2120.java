import java.util.ArrayList;
import java.util.Scanner;
/*
How many numbers that dont have repeated digits
87 104
989 1022
22 25
1234 1234
*/

public class DifferentDigits_2120{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b){
			int x = b;
			b = a;
			a = x;
			
			
		}
		
		int c = 0;
		for(int i = a; i <= b; i++){
			ArrayList<Character> al = new ArrayList<Character>();
			String str = String.valueOf(i);
			
			for(int j =0; j < str.length(); j++){						
				
				if(al.contains(str.charAt(j))){
					c++;
					break;
				}
				al.add(str.charAt(j));
			}
			
			
			
		}
		System.out.println((b-a+1)-c);
		}
		sc.close();
		
	}
}
