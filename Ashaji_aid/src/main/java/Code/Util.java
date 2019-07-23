package Code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Util 
{
	public static String PdfTextExtract_Service(String fPath) 
	  {
		ProcessBuilder pb = new ProcessBuilder(Arrays.asList("python", "target/classes/Folderlocation.py",fPath));
        Process p = null;
		try {
			p = pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        
        try {
			line = bfr.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return line;    	
	    }

}
