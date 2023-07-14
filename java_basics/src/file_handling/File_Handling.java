package file_handling;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;

public class File_Handling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("File.txt");
		Scanner input=new Scanner(file);
		while(input.hasNextLine()) {
			String line=input.nextLine();
			System.out.println(line);
		}

	}

}
