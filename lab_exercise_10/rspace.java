/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Thiagarajan
 */
public class rspace {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        FileInputStream f1=new FileInputStream("copy_read.txt");
        FileOutputStream f2=new FileOutputStream("copy_write.txt");
        int c;
        while((c=f1.read())!=-1)
        { 
            if((char)c!=' ')
                f2.write(c);
        }
        f1.close();
        f2.close();           
    }    
}
