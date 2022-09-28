package classesWithAttributes;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		_id =id;
		_renk = renk;
		_name=name;
		_price = price;
		_description = description;
		_stockAmount=stockAmount;
	}
	public Product() {
		
	}

	
	//attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	//getter
	public int getId() {
		return _id;
	}
	//setter
	public void setId(int id) {
		_id=id;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		_description = description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		_price = price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}
	public String get_kod() {
		return _kod;
	}
	public void set_kod(String kod) {
		_kod = kod;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		_renk = renk;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		_name = name;
	}
	
}
