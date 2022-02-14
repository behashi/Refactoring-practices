package conditionals.consolidatedconditional.good;

public class Main {
	
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExtraSalary(){
        double result = 0;
        if(isNotEligible())
            return result;
        //TODO aquí irían los calculos del nuevo salario
        return result;
    }

    private boolean isNotEligible(){
        boolean category = seniority<1 || education<1;
        boolean experience = incidents>10 || !certification;
        return category || experience;
    }

}
