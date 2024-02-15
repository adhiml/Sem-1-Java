/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t9;


public class T9Q1 {
    
    public static void main(String[] args) {
        
        // both method is correct
        
        Student s = new Student ();
        
        System.out.println("Student and Teacher belongs to the same class: " +  sameClass(s, new Teacher ()));
        System.out.println("Student is a descendent of class Person is :" + isClass(s));
        
        
    }
    
    public static boolean sameClass (Student s, Teacher t) {
        
        return s.getClass().equals(t.getClass());
    }
    
    // footnote: same superclass != same class
    
    public static boolean isClass (Student s) {
        
        return s instanceof Person;
    }
    
}

abstract class Person {         // use abstract when a class is incomplete on its own and need to be extended
    
    // below is wrong becasue Students and Teacher supposed 
    // to be a subclass for a person
//    public String Students;
//    public String Teacher;
}

class Student extends Person {};
class Teacher extends Person {};
    

