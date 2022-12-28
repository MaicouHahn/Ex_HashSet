package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class Application {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Zeturiell\\Desktop\\programação\\Java\\EXUdemy\\Generics, Set, Map\\7-Exercicio Resolvido(Set)\\in.txt";
		
		
		Set<LogEntry> user = new HashSet<>();//hashset pois é o mais rapido e a ordem de entrada dos usuarios nao importa
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				//se houver a tentativa de inserção de objetos repetidos pelo nome que foi a condiçao dada la na classe LogEntry
				//o Set vai barrar e usar apenas nomes unicos
				user.add(new LogEntry(fields[0],Date.from(Instant.parse(fields[1]))));
				line=br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(user.size());
	}

}
