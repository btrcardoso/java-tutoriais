package principal;

public class Principal {
	public static void main(String[] args) {
		
		ACMEBicycle bikeBlack = new ACMEBicycle();
		ACMEBicycle bikePink = new ACMEBicycle();
		
		bikeBlack.setNumGears(10);
		System.out.println(bikePink.getNumGears());
	}
}
