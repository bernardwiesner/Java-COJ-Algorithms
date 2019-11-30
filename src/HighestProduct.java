
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
public class HighestProduct {
    
    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 3){
            System.out.println(-1);
        }else{
            ArrayList<Integer> positives = new ArrayList();
            ArrayList<Integer> negatives = new ArrayList();

            for(int i = 0; i < n; i++){
                int number = scanner.nextInt();
                if(number >= 0){
                    positives.add(number);             
                }else{
                    negatives.add(number);               
                }
            }

            Collections.sort(positives, Collections.reverseOrder());
            Collections.sort(negatives);
            int totalPositives = 0;
            int totalNegatives = 0;


            if(positives.isEmpty()){
                Collections.sort(negatives, Collections.reverseOrder());
                totalNegatives = negatives.get(0) * negatives.get(1) * negatives.get(2);
            }
            else if(positives.size() > 2){
                totalPositives = positives.get(0) * positives.get(1) * positives.get(2);
            }


            if(negatives.size() >= 2 && positives.size() > 0){
                totalNegatives = negatives.get(0) * negatives.get(1) * positives.get(0);
            }

            if(totalNegatives > totalPositives || positives.isEmpty()){
               System.out.println(totalNegatives);            
            }else{
               System.out.println(totalPositives);  
            }            
        }

        
    }
    
}
