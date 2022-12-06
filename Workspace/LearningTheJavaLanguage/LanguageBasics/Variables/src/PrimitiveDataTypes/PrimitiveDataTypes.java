package PrimitiveDataTypes;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
			
		/* Primitive Data Types */
			
		// faixa de -128 a 127 
		byte byteType = 127;
		System.out.println(byteType);
		
		// faixa de -32768 até 32767
		short shortType = 32767;
		
		// faixa de -(2^31) até (2^31)-1
		int intType = 0;
		
		// float f1 = 1.1; Type mismatch: cannot convert from double to float
		float f1 = 1.1F;
		System.out.println(f1);
		
		// diz a lenda que objeto String não pode ser alterado, mas deve ser mentira
		String oi = "oi";
		oi = "ola";
		System.out.println(oi);
		
		
		/* Números em diferentes bases */
		
		// Número 26 em binário: 11010
		int binVal = 0b11010;
		// Imprime 26
		System.out.println(binVal);
		
		
		/* Unicode scapes */
		
		String sisenor = "S\u00ED Se\u00F1or";
		System.out.println(sisenor);
		
		
		/* Usando underscore */
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println(creditCardNumber);
	}
}
