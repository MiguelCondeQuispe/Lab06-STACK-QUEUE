package ejercicio4;

public class Test {
	public static void main(String[] args) throws ExceptionIsEmpty {
		String[] testCases = {
				"()()()[()]()",  
	            "((()))[]",       
	            "([])[](",        
	            "([{)]}",         
	            "[",              
	            "[][][]{{{}}}"    
		};

		for (String test : testCases) {
			System.out.println(test + " -> " + Aplication.symbolBalancing(test));
		}
	}
}
