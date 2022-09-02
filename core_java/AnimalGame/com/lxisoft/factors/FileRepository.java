package com.lxisoft.factors;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


import com.lxisoft.game.Animal;
import com.lxisoft.localization.Localization;
import com.lxisoft.test.*;
import com.lxisoft.game.Forest;
public class FileRepository{

	Localization object = new Localization();
public File myObj = new File("com/resources/Animal.csv");
	
	public void createFile() {
	
		try {
		
		if (myObj.createNewFile()) {
		  System.out.println(Localization.properties.getProperty("F_stmt_23") + myObj.getName());
		} else {
		  System.out.println(myObj.getName() + Localization.properties.getProperty("F_stmt_24"));
		}
   } catch (IOException e) {
		System.out.println(Localization.properties.getProperty("Error_stmt1"));
		e.printStackTrace();
   }
 

   }




        

public void writeToFile(){
try {
	FileWriter writer = new FileWriter(myObj);
	writer.write("Bengal-Tiger 7 7 7 True ,Cutey-Rabbitr 7 7 7 True ,Little-Deer 7 7 7 True ,Cunning-Fox 7 7 7 True ,King-Lion 7 7 7 True ,Indian-Elephant 7 7 7 True ,Angry-LeoPard 7 7 7 True ,Hungry-Guar 7 7 7 True ,Lazy-Crocodile 7 7 7 True ,Indian-Rhinoceros 7 7 7 True ");

	writer.close();
	System.out.println("Data successfully Entered!");
} catch (IOException e) {
	System.out.println("An error occured.");
	e.printStackTrace();
}
}

public  List<Animal> readFile(){
	List<Animal> animals = new ArrayList<>();

	try {
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()){
			String line = myReader.nextLine();
	
			String[] arrOfStr = line.split(",");
			
			String type = arrOfStr[0];
        Constructor<?> constructor = Class.forName("com.lxisoft.animals."+type).getConstructor(String.class, Integer.TYPE,Integer.TYPE,Integer.TYPE,Boolean.TYPE);
        Object object = constructor.newInstance(arrOfStr[1],Integer.parseInt(arrOfStr[2]) ,Integer.parseInt(arrOfStr[3]) ,Integer.parseInt(arrOfStr[4]) ,Boolean.parseBoolean(arrOfStr[5]));
		
      
			Animal animal = (Animal) object;
			
			animals.add(animal);
			
			
		
		}
		myReader.close();
	} catch (FileNotFoundException e) {
		System.out.println(Localization.properties.getProperty("Error_stmt1"));
		e.printStackTrace();
	}
	catch (ClassNotFoundException ex){
		System.out.println(Localization.properties.getProperty("Error_stmt2"));
		System.out.println(ex);
	}
	catch (NoSuchMethodException exp){
		System.out.println(Localization.properties.getProperty("Error_stmt3"));
		System.out.println(exp);
	}
	catch (InvocationTargetException expt){
		System.out.println(expt);
	}
	catch (InstantiationException expti){
		System.out.println(expti);
	}
	catch (IllegalAccessException exc){
		System.out.println(exc);
	}
	catch (IllegalArgumentException excp){
		System.out.println(Localization.properties.getProperty("Error_stmt4"));
		System.out.println(excp);
	}

return animals;
}


public void showFileInfo(){
	//if (TDD.getOption() == 1) {
	if(myObj.exists()){
		System.out.println(Localization.properties.getProperty("F_stmt_25") +myObj.getName() );
		System.out.println(Localization.properties.getProperty("F_stmt_26")  + myObj.getAbsolutePath());
		System.out.println(Localization.properties.getProperty("F_stmt_27")  + myObj.canWrite());
		System.out.println(Localization.properties.getProperty("F_stmt_28")  + myObj.canRead());
	}else{
		System.out.println(Localization.properties  .getProperty("F_stmt_29") );
	}

}

}








