package com.epam.task8;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * Remove 'A' if it is present in first 2 characters of the string.
 * if 'A' is present after 2 characters, it should not be removed.
 *
 */
public class App 
{
	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private static final Logger logger = LogManager.getLogger(App.class);
	static Properties props = new Properties();
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	logger.debug("Debugging Started");
        Scanner scan = new Scanner(System.in);
        ResultString res = new ResultString();
        logger.info("----Enter String------");
        myout.println("Enter String : ");
        String string = scan.next();
        logger.info("-----Resultant String-----");
        myout.println("Result String : " + res.removeA(string));
        logger.info("Debugging ended");
    }
}
