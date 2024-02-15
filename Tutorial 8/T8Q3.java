/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8;


public class T8Q3 {
    public static void main(String[] args) {
		new Coordinate(5, 6).display();
	}
}

class Coordinate {
    
    private int x;
    private int y;
    
    Coordinate (int x, int y) {
        
        this.x = x;
        this.y = y;
    }
    
    public void setCoordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX () {
        return x;
    }
    
    public int getY () {
        return y;
    }
    
    public void display () {
        System.out.println("Coordinate: (" + x + "," + y + ")");
    }
}