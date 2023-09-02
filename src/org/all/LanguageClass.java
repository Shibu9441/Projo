package org.all;

import org.english.*;
import org.tamil.*;
import org.telugu.*;

public class LanguageClass extends English{
	
	public void allLanguage() {
		System.out.println("All Lang= 3");
	}
	
	public static void main(String[] args) {
		
		LanguageClass c = new LanguageClass();
		c.allLanguage();
		c.englishLanguage();
		c.tamilLanguage();
		c.teluguLanguage();		
	}

}


