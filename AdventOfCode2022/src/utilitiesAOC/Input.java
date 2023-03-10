package utilitiesAOC;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Input {
	
	/**
	 * This class reads the input file and returns a list were every element is one line of the input file.
	 * @param year -> The year of the AOC you are coding as a string ie: "2021", "2022"... It's important to keep every file on Its corresponding folder.
	 * @param day -> The day of the AOC challenge as a string  ie: "1", "2", "3"...  
	 * @return A list of Strings where every String is a full line of the input file.
	 */
	public static List<String> listaString(String year,String day) {
		List<String> input = new ArrayList<String>();
		String name = "C:\\Users\\Andr?s\\git\\adventofcode\\AdventOfCode2022\\inputs\\" + year+ "\\" + day + ".txt";
		Path path = Paths.get(name);
		try {
			input = Files.readAllLines(path);
		} catch (Exception e) {
			System.err.println("No se ha encontrado el archivo con ruta " + name);
		}
		return input;
	}
	
	/**
	 * This class reads the input file and returns a list were every element is one line of the input file.
	 * @param year -> The year of the AOC you are coding as an int ie: 2021, 2022... It's important to keep every file on Its corresponding folder.
	 * @param day -> The day of the AOC challenge as an int ie: 1, 2, 3...  
	 * @return A list of Strings where every String is a full line of the input file.
	 */
	public static List<String> listaString(int year, int day) {
		return listaString(""+year, ""+day);
	}
	
}
