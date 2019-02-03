package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	

static ArrayList<Animal> farm = new ArrayList<Animal>();
	

	

	public static void main(String[] args) {

farm.add(new cheetah());
farm.add(new lion());
farm.add(new pig());	
farm.add(new elephant());


	for (int i = 0; i < 10; i++) {
		
		
		((cheetah) farm).makeNoise();
	}
		
		// TODO Auto-generated method stub

	}

}
