/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Scanner;
public class L4Q4 {
    
    public static void printCal (String[] day, int userday)
    {
        for ( int i = 0;i < 31;i++)
        {   
            System.out.print(day[(userday + i) %7]+ " ");
            if ((userday +  i + 1)%7 == 0)
            {
                System.out.println();
            }
        }
    }
    public static void main (String [] args)
    {
        Scanner g = new Scanner(System.in);
        int Maystart = 0;
        int Auguststart = 0;
        String[] month = {"May", "August"};
        int[] monthStarts = {Maystart,Auguststart};
        String day []={"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"};
        
        System.out.println("""
                         Sunday    (0)
                         Monday    (1)
                         Tuesday   (2)
                         Wednesday (3)
                         Thursday  (4)
                         Friday    (5)
                         Saturday  (6)
                         """);
       
        System.out.print("Enter the first day of the year:");
        int userday = g.nextInt();
        System.out.print("Enter the year:");
        int year = g.nextInt();
        
        // Validate user input for the first day of the year
        if (userday < 0 || userday > 6) {
            System.out.println("Invalid input for the first day of the year. Please enter a number between 0 and 6.");
            return;
        }

        // Validate user input for the year
        if (year < 0) {
            System.out.println("Invalid input for the year. Please enter a positive integer.");
            return;
}

        
        if (year%4 == 0)
        {
            Maystart = userday + 120;
            Auguststart = userday + 212; 
        }
        else
        {
            Maystart = userday + 121;
            Auguststart = userday + 213;
        }
            
        for ( int i = 0; i < 2; i++){
            String monthName = month[i];
            int monthStart =  monthStarts[i];
            
            System.out.println("\n" + monthName + " Calendar:");
            
            switch (userday)
            {
                case 0:
                    printCal(day, userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                    
                case 1:
                    printCal(day, userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                    
                case 2:
                    printCal(day,userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                
                case 3:
                    printCal(day,userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                
                case 4:
                    printCal(day,userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                
                case 5:
                    printCal(day,userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                    
                case 6:
                    printCal(day,userday + (monthStart % 7 == 0 ? 0 : 1));
                    break;
                    
                default:
                    System.out.println("Invalid starting day");
                    break;
            }
            
            System.out.println();
        }
    }
}
