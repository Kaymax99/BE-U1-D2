package epicode.d2;

public class Article {

	private String articleCode;
	private double price;
	String articleDesc;
	int availablePcs;
	public Article (String code, double price, String description, int available) {
		this.articleCode = code;
		this.price = price;
		this.articleDesc = description;
		this.availablePcs = available;
	}
}
