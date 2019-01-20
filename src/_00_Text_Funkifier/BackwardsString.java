package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {
	
	

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String dog = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			
		dog+=""+s.charAt(i) + "";
		
			System.out.println(s.charAt(i));
			
		}
		
		System.out.println(dog);
		
		return dog;
	}

}
