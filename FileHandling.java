import java.io.*;
import java.util.Scanner;

class FileHandling
{
	public static void main(String val[])
	{
		Scanner scanner = new Scanner(System.in);
		String filePath = "newFile.txt";
		
		System.out.println("Reading from the file:");
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
				String line;
				while((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}catch(FileNotFoundException e){
			System.out.println("File not found: "+filePath);
		}catch(IOException e){
			System.out.println("Error reading the file: "+e.getMessage());
	}
	
	System.out.println("Write anything you want to display on console or enter EXIT to finish");
	try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
		while(true){
		String input = scanner.nextLine();
		if(input.equalsIgnoreCase("exit")){
		break;
		}
		writer.write(input);
		writer.newLine();
	}
	}catch(IOException e){
	System.out.println("Error writing to the file: "+e.getMessage());
	}
	System.out.println("Data successfully written to the file");
	scanner.close();
	}
}
