package methods.inlinemethod.good;

public class Main {
	
    private double interest = 5d;

    double getRateInterest(){
        return interest > 5 ? 2 : 1;
    }

}
