/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Scanner;

public class T5Q4 {
//    public static void main(String[] args) {
//        
//        // Assuming 'sentence' is your string array
//        String[] sentence = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "The"};
//
//        // Word to count occurrences
//        String wordToCount = "the";
//
//        // Count occurrences
//        int count = countWordOccurrences(sentence, wordToCount);
//
//        // Display the result
//        System.out.println("The word '" + wordToCount + "' appears " + count + " times in the array.");
//    }
//
//    // Function to count occurrences of a word in a string array
//    private static int countWordOccurrences(String[] words, String targetWord) {
//        int count = 0;
//
//        // Loop through the array and count occurrences
//        for (String word : words) {
//            if (word.equals(targetWord)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
    
//////////////////////////////// students answer ///////////////////////////////
    
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the statement: ");
        String statement = scanner.nextLine();
        //split the statement in terms of space

        String [] sentence = statement.split(" "); // split the string based on the words in the sentence
        
        int count = 0;
        
        for (int u = 0; u < sentence.length; u++)
        {
                if (sentence[u].contains("the")== true || sentence[u].contains("The")== true)
                    count++;
        }
        
        System.out.println("The number of occurrence of the word 'the' : " + count + " times");
        
    }
}

