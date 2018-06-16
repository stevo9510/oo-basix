package defensevehicle;

public abstract class Ship implements Contact {
	private int length;
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setSpeed(String speed) {
		try {
			this.speed = Integer.parseInt(speed);
		} catch (NumberFormatException nfe) {
			System.out.printf("Speed of %s is not an integer and cannot be used as a speed.  No speed has been set.", speed);
			System.out.println();
		}
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		String formattedShipDetails = String.format("Name: %s | Type: %s | Speed: %d knots | Length: %d meters | Base Contact Type: Ship | ", 
				getName(), getType(), getSpeed(), getLength());
		
		return formattedShipDetails;
	}
}
