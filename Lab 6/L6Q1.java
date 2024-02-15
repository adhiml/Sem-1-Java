/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class L6Q1 {
    public static void main (String[] args)
    {
        int[] n = new int[20]; 
        for (int i = 0; i < n.length; i++)
        {
            int r = n[i];
            triangularNum(n);
            System.out.print( r + " ");
        }
    }
    
    public static void triangularNum (int n [])
    {
        int sum = 0;
        for (int i = 0; i < n.length; i++)
        {
           sum += 1 + i;
           n[i] = sum;
        }
    }
}
