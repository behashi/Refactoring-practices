package methods.inlinetemp.good;

import methods.inlinetemp.bad.Order;

public class Main {
	
	/*
	 * Calcular si debería tener descuento sí o no
	 */
    boolean calculateDiscount(Order order){
        return order.getPrice() > 200;
    }

}
