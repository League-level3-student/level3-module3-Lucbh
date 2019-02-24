package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		
	
	}

	@Override
	double getAnnualTaxes() {
		
		double tax = 0;
		tax = (population*growthRate) + 1000000;
		
	System.out.println(tax + " from San Diego");
		return tax;
	}
}
