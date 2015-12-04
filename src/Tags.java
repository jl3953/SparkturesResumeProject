import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * @author jenniferlam1
 *
 */
public class Tags {
	
	public static final int MAXIMUM_TAGS = 10;
	public static final String INPUT_FILE = "tags.txt";
	
	public static boolean tagsInOrder(String[] destination)
	{
		if (destination == null)
			return false;
		
		if (destination.length != MAXIMUM_TAGS)
			return false;
		
		for (int i = 0; i < MAXIMUM_TAGS; i++)
			destination[i] = "";
		
		//opening file and reading lines
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE));
			String line;
			for (int i = 0; i < MAXIMUM_TAGS && (line = br.readLine()) != null; i++)
				destination[i] = line;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

}
