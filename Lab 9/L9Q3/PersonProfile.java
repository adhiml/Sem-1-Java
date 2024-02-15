/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q3;


/**
 *
 * @author saada
 */
public class PersonProfile {
    
    String name;
    String gender;
    String birthdate;
    
    PersonProfile (String name, String gender, String birthdate) {
        
        this.birthdate = birthdate;
        this.name = name;
        this.gender = gender;
    }
    
    public static void main (String [] args) {
        
        String file = "C:\\Users\\saada\\OneDrive\\Desktop\\Sem 1\\FoP\\Week 11 (Inheritence)\\lecturer.txt";
        new Lecturer("Ali","Male","13-09-2035",file).display();
        
    }
}
