/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8;

import java.util.ArrayList;


public class T8Q5 {
    public static void main(String[] args) {
        
		Connection one = new Connection("AE016");
		Connection two = new Connection("AE017");
		Connection three = new Connection("AE018");
		
		Connection.display();
		
		one.disconnect();
		
		Connection.display();
	}
}

class Connection {
    private static int track = 0;
    private static ArrayList<String> connections = new ArrayList <String> (); 
    private static String ID;
    
    
    Connection (String ID) {
        track++;
        this.ID = ID;
        
        connections.add(ID);
    }
    
    public void disconnect () {
        track--; 
        
        // :: = a method of reference to a method
        // this case method = equals
        connections.removeIf(this.ID :: equals);
    }
    
    public static void display () {
        System.out.println("Current connections: " + track);
        
        for (int i = 0; i < connections.size(); i++)
        {
            System.out.println("Connection:" + connections.get(i));
        }
    }
}