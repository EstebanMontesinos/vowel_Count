/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.vowels;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author estebanmontesinos
 */
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        System.out.println("input a string");
        String str= s.nextLine();
        System.out.print("The number of vowels in the string "+count_Vowels(str));  
    }
    public static int count_Vowels(String str){
        int count=0;
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++; 
            } 
        }
         return count;
    }
        
    
}
