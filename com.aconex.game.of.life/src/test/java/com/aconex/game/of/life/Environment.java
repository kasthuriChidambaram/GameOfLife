package com.aconex.game.of.life;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class Environment {
	private final  Logger logger=LoggerFactory.getLogger(getClass());
	public  String getLocatorValue(String locator)  {
		try{         		
         YamlReader reader = new YamlReader(new FileReader((System.getProperty ("user.dir")+ "\\src\\test\\resources\\conf\\locator.yml")));
         Map locatorValue = (Map) reader.read();								
         return  (String) locatorValue.get(locator);
       }
        catch(FileNotFoundException | YamlException e){
	    logger.debug("There is an IO Exception");
	     return null;
		}
}
}

