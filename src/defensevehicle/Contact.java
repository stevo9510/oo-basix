package defensevehicle;

public interface Contact {
	int getLength();
	void setLength(int length);
	
	int getSpeed();
	void setSpeed(int speed);
	
	void setSpeed(String speed);
	
	String getName();
	void setName(String name);
	
	String getType();
	void setType(String type);
	
}
