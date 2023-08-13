package week8.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnThrows {
	
	public static void main(String[] args) throws IOException, InterruptedException   {
	    Thread.sleep(3000);
		FileInputStream fis = new FileInputStream("./data/CreateLead.xlsx");
		fis.close();
		
	}

}