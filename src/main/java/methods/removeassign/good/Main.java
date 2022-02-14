package methods.removeassign.good;

import methods.removeassign.bad.Order;

public class Main {


    double calculateDiscount(Order order, double totalPrice){
        double res = totalPrice;
        if (order.getPrice() > 100)
            res += order.getPrice() * order.getOffer(); // sobreescribe totalPrice
        return res;
    }
}
