/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saada
 */
import java.util.Random;
public class L3Q2 {
    public static void main (String[] args)
    {
        Random n =  new Random();
        int num = n.nextInt(6);
        
        switch (num)
        {
            case 0:
                System.out.print(num + ":zero");
                break;
            
            case 1:
                System.out.print(num + ":One");
                break;
                
            case 2:
                System.out.print(num + ":Two");
                break;
            
            case 3:
                System.out.print(num + ":Three");
                break;
            
            case 4:
                System.out.print(num + ":Four");
                break;
            
            default:
                System.out.print(num + ":Five");
            
        }
         System.out.println(" ");
         
////////////////////// a siwtch syntax variation ////////////////////////////
//                switch (num)
//        {
//            case 0: System.out.print(num + ":zero"); break;
//            case 1: System.out.print(num + ":One"); break;    
//            case 2: System.out.print(num + ":Two"); break;
//            case 3: System.out.print(num + ":Three"); break;
//            case 4: System.out.print(num + ":Four"); break;
//            default: System.out.print(num + ":Five");
//        }
         
/////////////////////////answer variation for L3Q2//////////////////////////////
                
//              Random g = new Random();
//              int rnumb = g.nextInt(6);
//              String word[] = { "zero","one","two","three","four","five"};
//              
//              System.out.println(rnumb + " is " + word[rnumb]);
    }
}
