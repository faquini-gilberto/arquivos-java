package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};
		
		String file = "C:\\workspace\\ws-eclipse\\teste22.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)) ) {
			
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
