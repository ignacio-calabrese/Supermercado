package supermercado;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		Supermarket supermarket = new Supermarket(); 
		supermarket.addProducts();
		
		ArrayList<Products> listProducts = supermarket.getProductlist();
		for (int i = 0; i < listProducts.size(); i++) {
			System.out.println(listProducts.get(i).toString());
		}
		
		System.out.println("=============================");
	
		System.out.println(supermarket.maxProduct());
		System.out.println(supermarket.minProduct());
	}
}