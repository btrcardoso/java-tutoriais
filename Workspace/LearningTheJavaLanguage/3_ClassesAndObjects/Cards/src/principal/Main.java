package principal;
import model.Card;

public class Main {
	
	public static void main(String[] args) {
		
		Card ca = new Card("Clubs","ACE");
		
		String[] students = new String[10];
		String studentName = "Peter Smith";
		students[0] = studentName;
		//studentName = null;
		System.out.println(students[0] == studentName);
		
		String myString = "oi";
		String mySecondString = myString;
		myString = null;
		System.out.println(mySecondString);
		
		StringBuffer sb = new StringBuffer("ola");
		StringBuffer sb2 = new StringBuffer("Adeus");
		System.out.println(sb);
		sb = sb2;
		sb2=null;
		System.out.println(sb);
	}

}
