package learning_buffer_reader;
import java.io.*;

public class Buffer_Reader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
        File file=new File("File.txt");
			FileReader fr=new FileReader(file);
			 br=new BufferedReader(fr);
			String line=br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				 line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
        finally {
        	br.close();
        }
	}

}
