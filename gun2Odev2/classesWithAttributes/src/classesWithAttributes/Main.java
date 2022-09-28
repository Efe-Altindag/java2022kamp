package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");
		/*
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus Laptop");
		product.set_price(2000);
		product.set_stockAmount(2);
		product.set_kod("L1");
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_kod());
		
		productManager.Add2(1, null, null, 3, 2000);

	}

}
