package data.magicnumbers.good;

public class Main {

    static final double SHIPPING_FEE = 4.99;
    static final double PRODUCT_DISCOUNT = 0.1;
    static final double MAX_PRICE = 100;

    public static void main(String[] args) {
        double price = 129.99;
        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
    	return price < MAX_PRICE ? SHIPPING_FEE : 0;
    }

    private static double calculateDiscount(double price) {
        return price * PRODUCT_DISCOUNT;
    }
}
