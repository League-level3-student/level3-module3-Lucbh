package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		
		double tax;
		tax = (population*growthRate)*(growthRate/2);
		
		System.out.println(tax + " from Los Angeles");
		
		return tax;
	}
	
}
