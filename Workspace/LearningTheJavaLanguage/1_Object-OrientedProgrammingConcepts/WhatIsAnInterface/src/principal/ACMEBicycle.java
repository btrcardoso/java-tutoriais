package principal;

public class ACMEBicycle implements Bicycle {
	
	int velocity = 0;
	
	static int numGears = 6;
	
	public void speedUp(int value) {
		velocity += value;
	}
	
	public void stop() {
		velocity = 0;
	}
	
	public int getNumGears() {
		return numGears;
	}
	
	public void setNumGears(int value) {
		numGears = value;
	}
	
}
