package Arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		int[] array1;
		array1 = new int[10];
		
		//shortcut syntax
		int[] array2 = {
				1, 2, 3
		};
		
		/* Copying Arrays */
		
		// arraycopy
		
		String[] copyFrom = {
			"Affogato0", "Americano1", "Cappuccino2", "Corretto3", "Cortado4",   
            "Doppio5", "Espresso6", "Frappucino7", "Freddo8", "Lungo9", "Macchiato10",      
            "Marocchino11", "Ristretto12"
		};
		
		String[] copyTo = new String[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7); // copyTo receberá do Cappucino2 até o Freddo8
		
		for(String coffe : copyTo) {
			System.out.println(coffe + " ");
		}
		
		// copyOfRange
		
		String[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		for(String coffee : copyTo2) {
			System.out.println(coffee + " ");
		}
		
		System.out.println(java.util.Arrays.toString(copyTo2));
		
		
		
	}

}
