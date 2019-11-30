
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class SortStrings {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList();
        
        for(int i = 0 ; i <= n; i++){
            al.add(sc.nextLine());
        }
        
//        Collections.sort(al, new Comparator<String>(){
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareToIgnoreCase(s2);
//            }
// 
//        });

        Collections.sort(al, String.CASE_INSENSITIVE_ORDER);
        for(String s : al){
            System.out.println(s);
        }
    }
    
}
