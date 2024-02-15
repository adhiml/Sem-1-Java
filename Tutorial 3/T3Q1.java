/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class T3Q1 {
    public static void main(String[] args)
    {
///////////////////////////////// a. //////////////////////////////////////////
        
        System.out.print("Question a. \n");
        
        int numa = 3 *8;
        if (numa == 27) // if (3*8==27)
            System.out.println("3 X 8 = 27.");
        else
            System.out.println("3 X 8 != 27.");
        
///////////////////////////////// b. //////////////////////////////////////////

        System.out.print("\nQuestion b. \n");
        
        System.out.print("\nPlease enter an integer:");
        Scanner i = new Scanner(System.in);
        int numb = i.nextInt();
        
        if ( numb%2 == 0)
            System.out.println("The number "+ numb +" is even.");
        else
            System.out.println("The number "+ numb +" is odd.");
        
///////////////////////////////// c. //////////////////////////////////////////

        System.out.print("\nQuestion c. \n");
        
        System.out.print("Enter the first word:");
        Scanner s = new Scanner(System.in);
        char letter = s.next().charAt(0);          //char letter = 'C';
        
        if ( letter >='A' && letter <+'Z') // if ( letter == 'C')
            System.out.println(letter +" is in capital letter.");
        else 
            System.out.println(letter +" is not in capital letter.");
        
//////////////////////////////////// d. ///////////////////////////////////////

        System.out.print("\nQuestion d. \n");
        
        System.out.print("Enter the first string:");
        Scanner w1 = new Scanner(System.in);
        String str1 = w1.nextLine();
        System.out.print("Enter the second string:");
        Scanner w2 = new Scanner(System.in);
        String str2 = w2.nextLine();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        int result = str1.compareToIgnoreCase(str2); // str1.compareTo(str2) == doesnt ignoring case
        
        if (result < 0) // negative result
            System.out.print(str1 + " comes before " + str2);
        else if (result > 0) // positive result
            System.out.print(str1 + " comes after " + str2);
        else
            System.out.print(str1 + "are equal to " + str2 + " in alphabetical order.");
        
        System.out.println(" ");
        
/////////////////////////////////////// e. ///////////////////////////////////

        System.out.print("\nQuestion e. \n");
        
        int day;
        System.out.print("""
                         
                        Sunday = 0
                        Monday = 1
                        Tuesday = 2
                        Wenesday = 3
                        Thursday = 4
                        Friday = 5
                        Saturday = 6
                        """);  
                         
        System.out.print("Choose the day:");
        Scanner d = new Scanner(System.in);
        day = d.nextInt();
        
        switch (day)
        {
            case 0:
                System.out.println("0 is Sunday.");
                break;
            case 1:
                System.out.println("1 is Monday.");
                break;
            case 2:
                System.out.println("2 is Tuesday.");
                break;
            case 3:
                System.out.println("3 is Wednesday.");
                break;
            case 4:
                System.out.println("4 is Thursday.");
                break;
            case 5:
                System.out.println("5 is Friday.");
                break;
            case 6:
                System.out.println("6 is Saturday.");
                break;
            default:
              System.out.println("The number you enter is not within range.");  
              break; // not wajib
        }

    }
}
