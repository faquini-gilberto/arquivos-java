package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;

public class Fixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String arquivo = ("C:\\workspace\\ws-eclipse\\teste22.csv");
		
		List<Produto> prod = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) { 
				//BufferedWriter bf = new BufferedWriter(new FileWriter(saida, true)) {
			
			String linha = br.readLine();
			
			while (linha != null) {
				String[] teste1 = linha.split(",");
				//Produto prod = new Produto(teste1[0], Double.parseDouble(teste1[1]), Integer.parseInt(teste1[2]));
				prod.add(new Produto(teste1[0], Double.parseDouble(teste1[1]), Integer.parseInt(teste1[2])));
				linha = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String saida = ("C:\\workspace\\ws-eclipse\\summary.csv");
		
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(saida))) {
			for (Produto produto : prod) {
				String linha = "" + produto.getNome() + "," + String.format("%.2f", produto.valorTotal());
				bf.write(linha);
				bf.newLine();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
