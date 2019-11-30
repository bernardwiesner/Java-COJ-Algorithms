
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android-hw
 */
public class BinarySearch {
    
    public static void main(String[] args){
        
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = divideAndConquer(arr, number, 0, arr.length);
        System.out.println(position);
        
    }
    
    public static int divideAndConquer(int[] arr, int number, int left, int right){

        System.out.println("once");
        boolean even = (left + right) % 2 == 0;
        int variable = (even) ? 0 : 1;

        int positionMiddle = (int) ((left + right) / 2);
        
        if(positionMiddle == arr.length){
            return -1;
        }
        if(arr[positionMiddle] == number){
            return positionMiddle;
        }
        if(left == right){
            return -1;
        }
        
        if(number > arr[positionMiddle]){
            left  = positionMiddle + variable;
        }
        else if(number < arr[positionMiddle]){
            right = positionMiddle - 1;        
        }
        
        return divideAndConquer(arr, number, left, right);
    }
    
}
