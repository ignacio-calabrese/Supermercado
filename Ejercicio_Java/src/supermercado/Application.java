package supermercado;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		Supermarket supermarket = new Supermarket(); 
		supermarket.addProducts();
		supermarket.getProductlist();
		System.out.println("=============================");
		supermarket.maxProduct();
		supermarket.minProduct();
	}
}