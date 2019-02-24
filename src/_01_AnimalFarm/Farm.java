package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	

static ArrayList<Animal> farm = new ArrayList<Animal>();
	

	

public static void main(String[] args) {

farm.add(new lion());
farm.add(new pig());	
farm.add(new elephant());
farm.add(new cheetah());
farm.add(new parrot());
farm.add(new monkey());

for (int i = 0; i < farm.size(); i++) {
		
	farm.get(i).makeNoise();
	farm.get(i).eat();
	
	}
		
		// TODO Auto-generated method stub

	}

}
