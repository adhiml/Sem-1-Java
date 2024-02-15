/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8;


public class T8Q1 {
    public static void main (String [] args)
    {
        // g.
        Student student = new Student();
        
        //h.
        student.setContactNum("012 - 768 9876");
        
        // i.
        Animal animal = new Animal ();
        
        // j.
        new Animal("cat");
        
        //k.
        Number number1 = new Number (20);
        Number number2 = new Number (40);
    } 
}


 class Student {
     
     private String contactNum;
     
     // c. 
     public Student ()
     {
         contactNum = null;
     }
     
     // d.
     public Student (String contactNum)
     {
         this.contactNum = contactNum;
     }
     
     // e. mutator method
     public void setContactNum (String contactNum)
     {
         this.contactNum = contactNum;
     }
     
     // e. accessor method
     public String getContactNum ()
     {
         return contactNum;
     }
     
     // f. displaying the number
     public void displayNum ()
     {
         System.out.println("Contact Number: " + contactNum);
     }
}

class Animal 
{
    private String animal;
    
    Animal ()
    {
        animal = null;
    }
    
   Animal (String animal)
   {
       this.animal = animal;
   }
}

class Number 
{
    private int value;
    
    Number (int value)
    {
        this.value = value;
    }
}