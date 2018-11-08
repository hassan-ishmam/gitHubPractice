import java.io.*;
import java.util.Scanner;

public class babyNameCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String boyData = "";
		String girlData = "";
		
		String [] boyNames = new String [1000];
		String [] girlNames = new String [1000];
		
		
		
		try {
			File inputFile = new File("babynames.txt");
			Scanner scan = new Scanner(inputFile);
			
			while(scan.hasNextLine())
			{
				scan.next();
				
				boyData = boyData + scan.next()+ "\t " +scan.next()+ "\t " + scan.next() + " \n";
				girlData = girlData +  scan.next()+ "\t " +scan.next()+ "\t " + scan.next() +" \n";
				
				
			}
			
			scan.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		
//Wrtiting data on boynames.txt	
		try {
			FileWriter boyFile = new FileWriter("boynames.txt");
		
			boyFile.write(boyData);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
//Wrtiting data on girlnames.txt		
		try {
			FileWriter girlFile = new FileWriter("girlnames.txt");
		
			girlFile.write(girlData);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		
	

	}

}
