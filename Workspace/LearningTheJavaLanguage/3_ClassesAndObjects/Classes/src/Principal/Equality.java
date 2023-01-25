package Principal;
import Principal.Pessoa;

public class Equality {
	
	public static void main(String[] args) {
		
		String oi = "oi";
		String oi2 = "oi";
		
		System.out.println(oi.equals(oi2));
		System.out.println(oi == oi2);
		
		char oi3 = 6;
		char oi4 = 'a';
		
		System.out.println(oi3);
		System.out.println(oi4);
		
		Pessoa ze = new Pessoa();
		Pessoa cloneze = new Pessoa();
		
		System.out.println(ze.equals(cloneze));
		System.out.println(ze == cloneze);
		
		
		System.out.println();
		
	}
	
	
	
	
	
	

}
