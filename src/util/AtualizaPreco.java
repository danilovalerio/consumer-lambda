package util;

import java.util.function.Consumer;

import entities.Product;

public class AtualizaPreco implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPreco(p.getPreco() * 1.1);	
	}

}
