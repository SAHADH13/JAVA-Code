package com.lxisoft.animals;

import java.util.Random;


import com.lxisoft.game.Animal;
import com.lxisoft.factors.AnimalEscapeException;
import com.lxisoft.test.*;
import com.lxisoft.localization.Localization;


public class Gaur extends Animal implements Herbivores {
       
      
       

       public Gaur(String animalName,int starvage,int strength,int distance,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
       	
       private int luckFactor;

       
                                                         //luckFactor
       public int getLuckFactor()
       {
              Random rand = new Random();
              luckFactor = rand.nextInt(10);
              return luckFactor;
       }

    
     Localization object = new Localization();
     public void escapeFromEnemy(Animal enemy){ 
        //  if (TDD.getOption() == 1) {
          try{
          if(enemy instanceof Carnivores && this instanceof Herbivores){
      System.out.println(this.getName() +Localization.properties.getProperty("E_stmt_1") );
      
          }
          else if(this instanceof Herbivores && enemy instanceof Carnivores){
              System.out.println(this.getName() +Localization.properties.getProperty("E_stmt_1"));
              
          }
          throw new AnimalEscapeException(Localization.properties.getProperty("E_stmt_2"));
      }catch(AnimalEscapeException e) {
          System.out.println(e);
       }
  
      }

}
