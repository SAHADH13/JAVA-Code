package com.lxisoft.factors;

import java.util.*;


import com.lxisoft.localization.Localization;
import com.lxisoft.test.*;


public class AnimalEscapeException extends Exception
{
	String message;
	Localization object = new Localization();
	

	public AnimalEscapeException(String str) {
	   message = str;
	}
	public String toString() {
	
		return (Localization.properties.getProperty("Exception_stmt") + message);
	}
	
	
 }