package methods.replacetemp.good;

public class Product {

    private double price;
    private int quantity;

    void printProductPrice(){
        // ....

        // ...
        if (quantityPriceCalculator(price, quantity) > 100){

        }else{

        }
        // ....
    }

    private double quantityPriceCalculator(double price, int quantity){
        return this.price * this.quantity * 2.0;
    }

}
