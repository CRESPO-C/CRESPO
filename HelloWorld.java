
package hello.world;

import java.util.Scanner;
import java.io.*;


public class HelloWorld{
        
        public static void main(String[] args){
            
       Runtime runtime =Runtime.getRuntime();
       try{
             System.out.println("Shutting dow the PC after 5 seconds.");
             runtime.exec("shutdown -s -t 5");
           
       }
       catch(IOException e){
             System.out.println("Exception:" +e);
       }
            
                    }
       
        
                }