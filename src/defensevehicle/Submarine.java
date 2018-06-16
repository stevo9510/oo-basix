package defensevehicle;

//that has the following attributes and get/set methods. 
//Supports int and String setNumberTorpedos() arguments. 
//If the String argument of setNumberTorpedos() encounters a parsing error, 
//set the numberTorpedos to 2
//numberTorpedos

public class Submarine extends Ship {
	private static final int DEFAULT_TORPEDOS = 2;
	
	private int numberTorpedos;

	public int getNumberTorpedos() {
		return numberTorpedos;
	}

	public void setNumberTorpedos(int numberTorpedos) {
		this.numberTorpedos = numberTorpedos;
	} 
	
	public void setNumberTorpedos(String numberTorpedos) {
		try {
			
			this.numberTorpedos = Integer.parseInt(numberTorpedos);
		} catch (NumberFormatException nfe) {
			this.numberTorpedos = DEFAULT_TORPEDOS;
		}
	} 
}
