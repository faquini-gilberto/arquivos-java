package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		String file = ("C:\\workspace\\ws-eclipse\\teste.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
						
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
