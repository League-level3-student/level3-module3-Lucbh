package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax;
		
		tax = (population*growthRate)*(2*growthRate);
		
		System.out.println(tax + " from Atlanta");
		return tax;
	}

}
