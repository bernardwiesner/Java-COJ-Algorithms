import java.util.Scanner;

public class ProfessorFarnsworthsGift_3932 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s1,s2,s3,s4,s5,s6,s7,s8,s9,s0;
        
        
        for (int i = 0; i < n; i++) {
            s1=s2=s3=s4=s5=s6=s7=s8=s9=s0="";
            long m = sc.nextLong();
            String s = String.valueOf(m);
            
                for (int j = 0; j < s.length(); j++) {
                    switch (s.charAt(j)){
                        case '1': s1 += "1";
                            break;
                        case '2': s2 += "2";
                            break;
                        case '3': s3 += "3";
                            break;
                        case '4': s4 += "4";
                            break;
                        case '5': s5 += "5";
                            break;
                        case '6': s6 += "6";
                            break;
                        case '7': s7 += "7";
                            break;
                        case '8': s8 += "8";
                            break;
                        case '9': s9 += "9";
                            break;
                        case '0': s0 += "0";
                            break;

                    }
                }
                if(m > 0){
                 String result = s1+s2+s3+s4+s5+s6+s7+s8+s9;
                 result = result.charAt(0) + s0 + result.substring(1, result.length());
                 System.out.println(result);
                }
                if(m < 0){
                        System.out.println("-"+s9+s8+s7+s6+s5+s4+s3+s2+s1+s0);
                    
                }
                if(m == 0){
                    System.out.println(0);
                }
            
        }
    }
}
