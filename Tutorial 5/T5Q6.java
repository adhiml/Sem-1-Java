/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;
public class T5Q6 {
    public static void main(String[] args) 
    {
        Random random = new Random();
        int number = random.nextInt(256);

        // Convert the number to binary and store the bits into an 8-bit array
        int[] binaryArray = convertToBinary(number);

        // Display the binary representation
        System.out.println("Random Number: " + number);
        System.out.print("Binary Representation: ");
        displayBinaryArray(binaryArray);
    }

    // Function to convert a number to binary and store the bits into an 8-bit array
    private static int[] convertToBinary(int number) 
    {
        int[] binaryArray = new int[8];

        for (int i = 7; i >= 0; i--) {
            binaryArray[i] = number % 2;
            number /= 2;
        }

        return binaryArray;
    }

    // Function to display the binary representation stored in an array
    private static void displayBinaryArray(int[] binaryArray) 
    {
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
        System.out.println();
    }
}
