package supermercado;

import java.util.ArrayList;

public class Supermarket {
	private ArrayList<Products> productlist;

	public Supermarket() {
		this.productlist = new ArrayList<Products>();
	} 
	
	public void addProducts() {
		productlist.add(new Products("Coca-Cola Zero", "Litros: 1.5", 20, null));
		productlist.add(new Products("Coca-Cola", "Litros: 1.5", 18, null));
		productlist.add(new Products("Shampoo Sedal", "Contenido: 500ml", 19, null));
		productlist.add(new Products("Frutillas", null ,64, "kilo"));
	}
	
	public ArrayList<Products> getProductlist() {
		return productlist;
	}
	
	public String maxProduct() {
		Products max = productlist.get(0);
		for (int i = 1; i < productlist.size(); i++) {
			if(productlist.get(i).compareTo(max) > 0) {
				max = productlist.get(i);
			}			
		}
		return "Producto más caro: " + max.getName();
	}
	
	public String minProduct() {
		Products min = productlist.get(0);
		for (int i = 0; i < productlist.size(); i++) {
			if(productlist.get(i).compareTo(min) < 0) {
				min = productlist.get(i);
			}			
		}
		return "Producto más barato: " + min.getName();
	}
}