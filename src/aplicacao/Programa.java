package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

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
		
		//expressao declarada
		Consumer<Product> cons = item -> item.setPreco(item.getPreco() * 1.1);
		
		//ao inv�s de chamar o m�todo chamaremos a cons
		list.forEach(cons);
		
		//M�todo println chamado por referencia de m�todo
		list.forEach(System.out::println);

	}
	
	

}
