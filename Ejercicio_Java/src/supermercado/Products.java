package supermercado;

public class Products implements Comparable<Products> {
	
	private String name;
	private String volume;
	private int price;
	private String salesUnit;
	
	public Products(String name, String volume, int price, String salesUnit) {
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.salesUnit = salesUnit;
	}
	
	public String getName() {
		return name;
	}

	public String getVolume() {
		return volume;
	}

	public int getPrice() {
		return price;
	}

	public String getSalesUnit() {
		return salesUnit;
	}

	public String toString() {
		String toName = "Nombre: " + name;
		String toVolume = " /// " + volume ;
		String toPrice = " /// Precio: $" + price;
		String toSalesUnit = " /// Unidad de venta: " + salesUnit;
		
		if(name == null || name == "") {
			toName =""; 
		}
		
		if(volume == null || volume == "") {
			toVolume = "";
		}
			
		if(salesUnit == null || salesUnit == "") {
			toSalesUnit = "";
		}
		
		return toName + toVolume + toPrice + toSalesUnit;	
	}

	public int compareTo(Products product) {
		// TODO Auto-generated method stub
		
		if (this.price < product.price) {
			return -1;
		} else if (this.price > product.price) {
			return 1;
		} else {
			return 0;			
		}
	}
}