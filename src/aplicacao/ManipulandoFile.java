package aplicacao;

import java.io.File;
import java.util.Scanner;

public class ManipulandoFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho: ");
		String caminho = sc.nextLine();
		
		File path = new File(caminho);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean ok = new File(path + "\\novo").mkdir();
		System.out.println(ok);
		
		sc.close();
	}

}
