package com.lxisoft.game;

import java.util.Random;

import com.lxisoft.animals.*;
import com.lxisoft.factors.Location;
import com.lxisoft.factors.AnimalEscapeException;
import com.lxisoft.animals.Herbivores;
import com.lxisoft.localization.Localization;
import com.lxisoft.test.TDD;

public class Animal {
	private String animalName;
	private int starvage,strength,distance,luckFactor;
	private boolean isAlive;
	
	public Location animalLocation = new Location() ;
       // TDD opt = new TDD();

public Animal(String animalName,int starvage,int strength,int distance,boolean isAlive){
	
	this.animalName = animalName;
	this.starvage = starvage;
	this.strength = strength;
	this.distance = distance;
	this.isAlive =  isAlive;
	
}

Random rand = new Random();

public String getName()
{
	return animalName;
}
																	//name
public void setName(String animalName)
{
	
	this.animalName=animalName;
}

public int getStarvage()
{
return starvage; 	
}
                                    

public void setStarvage(int starvage)	               //starvage
{
	this.starvage=starvage;
}

public int getDistance()
{
return distance;
}

                                        
public void setDistance(int distance)		               //distance
{
	this.distance=distance;
}

public int getStrength()
{
	return strength;
}                                        

public void setStrength(int strength)			           //stamina
{
	this.strength = strength;
}

public boolean getIsAlive()
	{
		return isAlive;
	}

public void setIsAlive(boolean alive)
	{
		this.isAlive = alive;
	}
	

public int getLuckFactor()									//luckFactor
{
	
	luckFactor=rand.nextInt(3);
	return luckFactor;

}

public void setAnimalLocation(int x,int y)
	{
		animalLocation.setLocationXAxis(x) ;
		animalLocation.setLocationYAxis(y) ;
	}

public int getAnimalLocationX()
	{
		
		return animalLocation.getLocationXAxis();
	}

	public int getAnimalLocationY()
	{
		
		
		return animalLocation.getLocationYAxis();
	}

	public double createRoamingArea(int x1, int x2, int y1,int y2){

		double roamArea = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));
		return roamArea;
  }    
  Localization object = new Localization();

protected void printData() {
         
  
	System.out.println(Localization.properties.getProperty("A_statement_26 ") + this.getName());
	System.out.println(Localization.properties.getProperty("A_statement_23 ") +": " + this.getStarvage());
	System.out.println(Localization.properties.getProperty("A_statement_21 ") +": " + this.getStrength());
	System.out.println(Localization.properties.getProperty("A_statement_27 ") + this.getDistance());
	System.out.println();
 
}



public Animal startFight(Animal opponent){  // new venture
	
	
	int starvageOfPlayer1 = this.getStarvage();
	int starvageOfPlayer2 = opponent.getStarvage();
	Animal winner;
	
	int strengthOfPlayer1 = this.getStrength();
	int strengthOfPlayer2 = opponent.getStrength();

	if(this instanceof Herbivores && opponent instanceof Herbivores){


		
		System.out.println(Localization.properties.getProperty("A_statement_1"));
	
		System.out.println(this.getName() + Localization.properties.getProperty("A_statement_28")  + opponent.getName());

		System.out.println(Localization.properties.getProperty("A_statement_2") +"*~~~~~~~*");
			 
	
		

		
		 return this;
	}
	//return player1;
	else if(this instanceof Carnivores && opponent instanceof Herbivores) {
				
		
		System.out.println("\n" +opponent.getName()+ Localization.properties.getProperty("A_statement_3") +this.getName());
		if(opponent.getLuckFactor() >= 5 ){

		System.out.println("\n"+ Localization.properties.getProperty("A_statement_4") +opponent.getName()+ Localization.properties.getProperty("A_statement_5") +  Localization.properties.getProperty("A_statement_6") +this.getName()+"\n");
		
		Herbivores herbivores = (Herbivores) opponent;
		herbivores.escapeFromEnemy(this);
		
	}else{
			System.out.println("\n \t \t \t"+  Localization.properties.getProperty("A_statement_7") +"\t \t \n");
		
		System.out.println("\t"+opponent.getName()+ Localization.properties.getProperty("A_statement_8") +this.getName());
		System.out.println("\t" +this.getName()+ Localization.properties.getProperty("A_statement_9") +opponent.getName());
														System.out.println();			
		System.out.println(Localization.properties.getProperty("A_statement_10") +this.getName()+ Localization.properties.getProperty("A_statement_11") +opponent.getName() );
	 
		System.out.println("\t\t\t . \t\t\t");
																  
										   System.out.println("\t " + Localization.properties.getProperty("A_statement_12") +opponent.getName()+ Localization.properties.getProperty("A_statement_13") +"!!!!!!");
										   strengthOfPlayer2  = 0;
										   System.out.println("\t\t\t .. \t\t\t");
										   System.out.println("\t"+ Localization.properties.getProperty("A_statement_12") +opponent.getName()+ Localization.properties.getProperty("A_statement_14") +strengthOfPlayer2);								  
																  
										   System.out.println("\t\t\t ... \t\t\t");
								
										  if(opponent.getIsAlive() == true && opponent.getStrength() < 7){
											Carnivores c = (Carnivores) this;
															 c.killOpponent(this,opponent);
															
         System.out.println("\t"+ opponent.getName()+ Localization.properties.getProperty("A_statement_15") +this.getName());
System.out.println("\t\t\t ------------- \t\t\t");
									}else{
										System.out.println(Localization.properties.getProperty("A_statement_16"));
										Herbivores herbivores = (Herbivores) opponent;
										herbivores.escapeFromEnemy(this);
									}

									winner = this;
			  return winner;
		}
		
}
else if(this instanceof Herbivores && opponent instanceof Carnivores){
	
	System.out.println(this.getName()+ Localization.properties.getProperty("A_statement_3") +opponent.getName());
	if(this.getLuckFactor() >= 5 ){

	System.out.println(Localization.properties.getProperty("A_statement_17") +this.getName()+ Localization.properties.getProperty("A_statement_5")+ Localization.properties.getProperty("A_statement_6") +opponent.getName());
	
	Herbivores herbivores = (Herbivores) this;
	herbivores.escapeFromEnemy(opponent);

	}else{

		System.out.println("\n \t \t \t "+ Localization.properties.getProperty("A_statement_7") +"\t \t \n");

	System.out.println("\t"+ this.getName()+Localization.properties.getProperty("A_statement_8")+opponent.getName());
	System.out.println("\t"+ opponent.getName()+Localization.properties.getProperty("A_statement_9")+this.getName());
					System.out.println();											
	System.out.println(Localization.properties.getProperty("A_statement_10")+opponent.getName()+Localization.properties.getProperty("A_statement_11")+this.getName() );
	System.out.println("\t\t\t . \t\t\t");
	System.out.println("\t" + Localization.properties.getProperty("A_statement_12")+this.getName()+ Localization.properties.getProperty("A_statement_13"));	
	System.out.println("\t\t\t .. \t\t\t");

strengthOfPlayer1 = 0;		
System.out.println("\t"+Localization.properties.getProperty("A_statement_12") +this.getName()+Localization.properties.getProperty("A_statement_14")+strengthOfPlayer1);								  
System.out.println("\t\t\t ... \t\t\t");
if(this.getIsAlive() == true && this.getStrength() < 7){
		Carnivores c = (Carnivores) opponent;
                         c.killOpponent(this,opponent);
				
         System.out.println("\t"+ this.getName()+ Localization.properties.getProperty("A_statement_15") +opponent.getName());
System.out.println("\t\t\t ------------- \t\t\t");
}
else{

System.out.println(Localization.properties.getProperty("A_statement_16"));

Herbivores herbivores = (Herbivores) this;
										   herbivores.escapeFromEnemy(opponent);
										   
}
	winner = opponent;
	return winner;
	}
}
else{
	if(this instanceof Carnivores && opponent instanceof Carnivores){

		System.out.println(this.getName()+ Localization.properties.getProperty("A_statement_18")+opponent.getName());
		System.out.println(this.getName()+ Localization.properties.getProperty("A_statement_19")+strengthOfPlayer1+Localization.properties.getProperty("A_statement_20")+opponent.getName()+ Localization.properties.getProperty("A_statement_19")+strengthOfPlayer2+ Localization.properties.getProperty("A_statement_21"));
		System.out.println(this.getName()+Localization.properties.getProperty("A_statement_19")+starvageOfPlayer2+Localization.properties.getProperty("A_statement_22")+opponent.getName()+ Localization.properties.getProperty("A_statement_19")+starvageOfPlayer2+ Localization.properties.getProperty("A_statement_23"));
		System.out.println(Localization.properties.getProperty("A_statement_24")+"!!!"+ Localization.properties.getProperty("A_statement_25")+"............");
	}
return this;
}

return this;
}



}
