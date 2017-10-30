
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android-hw
 */
public class PrimeWalk_2291 {
    public static void main(String[] args) {
        
        int number = 10000000;
        boolean[] primes = new boolean[number+1];
        int top = (int)Math.sqrt(number);
        for (int i = 2; i <= top; i++) {
            if(primes[i] == false){
                for (int j = i*i; j <= number; j+=i ) {
                    primes[j] = true;
                }
            }
        }
      
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primes[1] = true;
        
        int x = 0;
        int y = 0;
        int direction = 0; // 0 - up; 1 - right; 2 - down; 3 - left;
        int[] coordinate_x = new int[10000001];
        int[] coordinate_y = new int[10000001];
        
        for (int j = 1; j <= 10000000; j++) {

            switch (direction) {
                case 0: y++;
                    break;
                case 1: x++;
                    break;
                case 2: y--;
                    break;
                case 3: x--;
                    break;
                default:
                    break;
            }
            coordinate_x[j] = x;
            coordinate_y[j] = y;
            
            if(primes[j] == false){
                switch (direction) {
                    case 0: direction = 1;
                        break;
                    case 1: direction = 2;
                        break;
                    case 2: direction = 3;
                        break;
                    case 3: direction = 0;
                        break;
                    default:
                        break;
                }
            }

        }
        
        for (int i = 0; i < num; i++) {
            
            int K = sc.nextInt();
            
            System.out.println(coordinate_x[K] + " " + coordinate_y[K]);
                       
        }
        
        
    }
}
