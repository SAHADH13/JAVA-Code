package com.lxisoft.factors;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.lxisoft.test.*;
import com.lxisoft.game.*;
import com.lxisoft.localization.*;
public class DataBase {

    public List<Animal> retriveData(){

        Connection con = null;
        PreparedStatement ps = null;
        Statement st = null;
        ResultSet rs = null;
        String animalName, isAlive;
        int starvage,strength,distance;
        
        List<Animal> animals = new ArrayList<>();

        try{
          
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root"); 
            st = con.createStatement(); 
            rs = st.executeQuery("select * from animals ");  
            while(!rs.isLast() && rs.next()) 
          {

            Constructor<?> constructor = Class.forName("com.lxisoft.animals."+rs.getString(1) ).getConstructor(String.class, Integer.TYPE,Integer.TYPE,Integer.TYPE,Boolean.TYPE);
            Object object = constructor.newInstance(rs.getString(2),rs.getInt(3) ,rs.getInt(4) ,rs.getInt(5) ,Boolean.parseBoolean(rs.getString(6)));

            Animal animal = (Animal) object;
			animals.add(animal);

      
          }
    con.close();
    st.close();
          
    return animals;    
}catch(Exception e){
     System.out.println(e);
     e.printStackTrace();
    }

     return null;
    }
   
}
