package com.lxisoft.animals;

import java.util.Random;
import com.lxisoft.game.Animal;
import com.lxisoft.test.*;
import com.lxisoft.localization.Localization;


public class Fox extends Animal implements Carnivores {

      

       public Fox(String animalName,int starvage,int strength,int distance , boolean isAlive)
       {
              super(animalName,starvage,strength,distance, isAlive);
       }
      
      
       Localization object = new Localization();
       public String killOpponent(Animal player1,Animal player2){
      
              
              if (player1 instanceof Herbivores && player2 instanceof Carnivores){
               System.out.println(Localization.properties.getProperty("Design_1") );
               System.out.println(Localization.properties.getProperty("Fight_stmt1")+player1.getName()+ Localization.properties.getProperty("Fight_stmt2") +player2.getName()+ Localization.properties.getProperty("Fight_stmt3"));
               System.out.println(Localization.properties.getProperty("Fight_stmt4")+player1.getName());
               player1.setIsAlive(false);
               System.out.println(Localization.properties.getProperty("Fight_stmt5")+player1.getName()+ Localization.properties.getProperty("Fight_stmt6")+player1.getIsAlive());
               
              
              }else if(player1 instanceof Carnivores && player2 instanceof Herbivores){
        
        System.out.println(Localization.properties.getProperty("Design_1"));
               System.out.println( Localization.properties.getProperty("Fight_stmt1")+player1.getName()+  Localization.properties.getProperty("Fight_stmt2") +player2.getName()+  Localization.properties.getProperty("Fight_stmt3"));
               System.out.println( Localization.properties.getProperty("Fight_stmt4")+player2.getName());
               player2.setIsAlive(false);
               
               System.out.println(Localization.properties.getProperty("Fight_stmt5")+player2.getName()+ Localization.properties.getProperty("Fight_stmt6")+player2.getIsAlive());
           
        
              }
           return  Localization.properties.getProperty("Fight_stmt7");
             
             }


      


    
}
