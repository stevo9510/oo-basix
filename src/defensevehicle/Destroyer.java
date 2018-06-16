package defensevehicle;
//that has the following attributes and get/set methods. 
//Supports int and String setNumberMissiles() arguments. 
//If the String argument of setNumberMissiles() encounters a parsing error, 
//set the numberMissiles to 2.
//numberMissile

public class Destroyer extends Ship {
	// default number of missiles for destroyer to be used on parse integer
	// of setNumberMissiles(String) 
	private static final int DEFAULT_MISSILES = 2;
	
	private int numberMissiles;
	
	public int getNumberMissiles() {
		return numberMissiles;
	}

	public void setNumberMissiles(int numberMissiles) {
		this.numberMissiles = numberMissiles;
	}
	
	public void setNumberMissiles(String numberMissiles) {
		try {
			int parsedMissiles = Integer.parseInt(numberMissiles);
			setNumberMissiles(parsedMissiles);
		} catch (NumberFormatException nfe) {
			setNumberMissiles(DEFAULT_MISSILES);
		}
	}
	
}
