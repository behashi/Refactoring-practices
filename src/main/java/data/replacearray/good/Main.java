package data.replacearray.good;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setType("Chair");
		product.setPrice(49.99);
		product.setColor("Black");
		product.setNumUnits(5);

		double finalPrice = calculatePrice(product.getPrice(), product.getNumUnits());
	}

	private static double calculatePrice(double price, int numUnits){
		return price * numUnits;
	}
}
