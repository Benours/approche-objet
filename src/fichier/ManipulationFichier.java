package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:/Users/benja/OneDrive/Bureau/Diginamic/JAVA/recensement.csv");
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
		
		List<String> newLines = new ArrayList<String>();
		
		if (estFichier) {
			if (estLisible) {
				List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
				for (String string : lines) {
					String[] token = string.split(";");
					token[2] = token[2].trim().replaceAll(" ", "");
					token[6] = token[6].trim().replaceAll(" ", "");
					token[9] = token[9].trim().replaceAll(" ", "");
					
					if (!token[9].equals("Populationtotale")) {
						if (Integer.parseInt(token[9]) > 25000)	{			
							newLines.add(token[6] + ";" + token[2] + ";" + token[9] + ";");
						}
					}
					else {
						newLines.add(token[6] + ";" + token[2] + ";" + token[9] + ";");
					}
				}
			}
			else {
				System.err.println("N'est pas lisibles");
			}
		}
		else {
			System.err.println("N'est pas un fichier");
		}
		
		for (String string : newLines) {
			System.out.println(string);
		}
		Path pathCible = Paths.get("C:/Users/benja/OneDrive/Bureau/Diginamic/JAVA/recensement-edit.csv");
		Files.write(pathCible, newLines);
	}

}
