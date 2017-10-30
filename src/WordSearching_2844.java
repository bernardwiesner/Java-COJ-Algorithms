
import java.util.Scanner;

/*
word
Write a program to count the occurrences
of a particular word in a given text
i.e. how many times does a particular
word appear in a text? This Word is not counted
but wording is counted.
 */
public class WordSearching_2844 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        String text = sc.next();
        while(sc.hasNext()){
            String s = sc.nextLine(); 

            text += s + " ";
        }
        
        int c = 0;
        while(text.contains(word)){
            text = text.replaceFirst(word, " ");
            c++;
        }
        System.out.println(c);
    }
}
