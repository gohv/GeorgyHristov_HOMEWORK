package Dictionary.src.edu.pragmatic.dictionary.model;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FileService {

	static public boolean save(Collection<WordEntity> wordEntities, String fileName) throws IOException {

		if (wordEntities == null || fileName == null) {
			return false;
		}

		try (FileWriter fileWriter = new FileWriter(fileName);
				BufferedWriter buffer = new BufferedWriter(fileWriter);
				PrintWriter write = new PrintWriter(buffer)) {

			for (WordEntity wordEntity : wordEntities) {
				StringBuilder builder = new StringBuilder();
				builder.append(wordEntity.getWord());
				builder.append("=");
				builder.append(wordEntity.getTranslation());
				write.println(builder.toString());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static Collection<WordEntity> load(String fileName) throws IOException {
		
		Collection<WordEntity> wordEntities = new ArrayList<>();
		try (FileInputStream inputStream = new FileInputStream(fileName); Scanner sc = new Scanner(inputStream)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				line.split("=");
				String[] tokens = line.split("=");
				if (tokens.length == 3) {
					WordEntity wordEntit = new WordEntity(tokens[0], tokens[1], tokens[2]);
					wordEntities.add(wordEntit);
					
				}

			}

		}

		return wordEntities;

	}

}
