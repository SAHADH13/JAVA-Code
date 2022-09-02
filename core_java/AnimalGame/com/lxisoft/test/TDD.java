package com.lxisoft.test;


import java.io.*;
import java.util.Scanner;


import com.lxisoft.game.Animal;
import com.lxisoft.game.Forest;
import com.lxisoft.localization.Localization;
import com.lxisoft.factors.*;
public class TDD {
       private static int option;
       private static String name;
       public static void main(String[] args){
            
             System.out.println("choose your language :  \n  നിങ്ങളുടെ ഭാഷ തിരഞ്ഞെടുക്കുക :");
             System.out.println("\n 1.English \n 2.മലയാളം  \n");
        
             Scanner sc = new Scanner(System.in);
            
            setOption(sc.nextInt());
             Forest forest = new Forest();
             switch(option){    
              case 1:    
              Localization.initialize(getOption());
              forest.welcomeToForest();
              
              break;   
              case 2:    
              Localization.initialize(getOption());
              forest.welcomeToForest();
          
               break;  //optional  
                  
                  
              default:     
                System.out.println(" Wrong one is choosed ! please Try again  \n തെറ്റായ ഒന്ന് തിരഞ്ഞെടുത്തു! ദയവായി വീണ്ടും ശ്രമിക്കുക "); 
         
 
              } 
             
              
       }
       public static void setOption(int option)		               //distance
       {
              TDD.option=option;
       }
       
       public static int getOption()
       {
              return option;
       }
     
}