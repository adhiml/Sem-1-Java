/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class L10Q2 {
    
}

interface MessageEncoder {
    
//    protected String cipherText;
//    no need cause this is interface
//    
//    public String encode (String plainText) {
//        return cipherText;
//    }
    
    StringBuilder encode (StringBuilder plainText);  // can also use string
    StringBuilder decode (StringBuilder cipherText);
}

class SubstitutionCipher implements MessageEncoder {
    
    String inputFileName;
    String outputFileName;
    int shift;
    final String Path = "C:\\Users\\saada\\OneDrive\\Desktop\\Java\\FoP Tutorial\\Lab10";
    
    SubstitutionCipher (String inputFileName, String outputFileName, int shift) {
        
        this.inputFileName = Path + inputFileName;
        this.outputFileName = Path + outputFileName;
        this.shift = shift;
    }
    
    public StringBuilder readFromTextFile () throws IOException {
        
        StringBuilder text = new StringBuilder ();
        
        try (BufferedReader reader = new BufferedReader (new FileReader (inputFileName)))
        {
            String line = "";
            
            while ((line = reader.readLine()) != null) {
                text.append(line + "\n");
            }
        }
        return text;
    }
    
    public StringBuilder encode (StringBuilder plainText) {
        
        StringBuilder sb = new StringBuilder ();
        
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                sb.append(encode(ch,96));
            }
            
        }
    }
    
    public char encode (char ch, int startKey) {
        
        int ascii = (int) ch;
        return (char) (())
    }
    
    public StringBuilder decode (StringBuilder cipherText) {
        
    }
    
    
    public void convertToFile (String type) throws IOException {
        
        try (PrintWriter write = new PrintWriter (outputFileName)) 
        {
            if (type.equals("encode"))
            {
                write.print(encode(read));
            }
            else
            {
                
            }
        }
    } 
}

