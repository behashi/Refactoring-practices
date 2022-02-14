package methods.extractvariable.good;

import methods.extractvariable.bad.Order;

public class Main {
	
    void printProductPrice(Order order){
        Double pricePerQuantity = order.getPrice() * order.getQuantity();
        Double priceReduction = order.getOffer() + order.getShipping() * 2;
        Double totalPrice =  pricePerQuantity - priceReduction;
        
        System.out.println(totalPrice);
    }

}
