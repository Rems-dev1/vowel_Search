import java.util.Scanner;

public class Vowels{
    public static void main(String[] args){
       // count the vowels in the string
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < word.length(); i++){
            if (vowels.indexOf(word.charAt(i)) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        input.close();
    }
    
}