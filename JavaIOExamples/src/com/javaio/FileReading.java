/**
 * 
 */
package com.javaio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Shree
 *
 */
//Interface--abstract class(1-99)--class(100)
public class FileReading {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String path="F:\\workspace\\JavaIOExamples\\src\\test.txt";
		File f=new File(path);
		InputStream in=new FileInputStream(f);
		in=new BufferedInputStream(in);
		int text;
		while ((text = in.read()) != -1) {
			// convert to char and display it
			//System.out.print((char) content);
			System.out.println((char) text);
		}
		
		in.close();
		
		/*while ((text = in.read()) != -1) {
			// convert to char and display it
			//System.out.print((char) content);
			System.out.println( text);
		}*/
		
		//Character
		//numer of round trips with file system
		//limited improvemnts with bufferstrems
	}

}
