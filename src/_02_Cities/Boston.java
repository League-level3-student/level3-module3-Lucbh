package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax;
		
		tax = (population*growthRate) + (population/2);
		
		System.out.println(tax + " from Boston");
		return tax;
	}

}
