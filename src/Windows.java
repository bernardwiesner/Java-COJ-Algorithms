
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class Windows {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        int window = scanner.nextInt();
        int n = scanner.nextInt();
        List<Long> al = new ArrayList();
        for(int i = 0; i < n; i++){
            al.add(scanner.nextLong());
            
        }
        int currentPosition = 0;
        
        for(long i = 1; i < al.size(); i++){
            if(i == al.size()){
                continue;
            }
            List range = new ArrayList<>(al.subList(currentPosition, window));
            Collections.sort(range, Collections.reverseOrder());
            System.out.print(range.get(0) + " ");
            currentPosition++;
            window++;
            
        }

    }
}
