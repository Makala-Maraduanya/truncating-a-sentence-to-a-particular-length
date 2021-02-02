/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author ODHIS
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    static Scanner input=new Scanner(System.in);
    
    static String sentence;
    static int length;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please Enter a sentence and the length you wish it to be ");
        sentence=input.nextLine();
        System.out.println("Please Enter the length you wish it to be ");
        length=input.nextInt();
        
        
        truncate(length,sentence);
    }
    
    public static void truncate(int len, String sent){
        int count=0;
        String status="not";
        for(int i=0;i<sent.length();i++){
            if(sent.substring(i, i+1).equals(" ")){
               count=count+1;
               if(count==len){
                   for(int j=0;j<i;j++){
                       System.out.print(sent.substring(j, j+1));
                   }
                   status="printed";
                   break;   
               }              
            }
        }
        if(status.equals("not")){
            for(int j=0;j<sent.length();j++){
                System.out.print(sent.substring(j, j+1));
            }
        }
    }
}
