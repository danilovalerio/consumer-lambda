package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.AtualizaPreco;

/*
 * Programa que, a partir de uma lista de produtos, 
 * aumenta o pre�o dos produtos em 10%.
 */

public class Programa {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//referencia para o m�todo N�O est�tico de atualiza��o
		list.forEach(Product::naoStaticAtualizaPreco);
		
		//M�todo println chamado por referencia de m�todo
		list.forEach(System.out::println);

	}
	
	

}
