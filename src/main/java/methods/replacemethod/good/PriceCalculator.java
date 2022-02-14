package methods.replacemethod.good;

class PriceCalculator extends Product{
    double result = 0;
    double priceQuantity = this.price * this.quantity;
    double priceDiscount = this.price * this.discount;
    double priceShipping = shipping * 0.50;

    public PriceCalculator() {}
    double calculatePrice() { return result;}
}