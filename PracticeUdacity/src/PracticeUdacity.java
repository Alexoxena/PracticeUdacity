
public class PracticeUdacity {
	
	public static int factorial (int n){
		int factorial = 1;
		for (int i=2; i<=n; i++){
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
	}
	
	public static int checkArray (String [] stringArray, String target){ //es wird überprüft ob der String target im übergebenen Array enthalten ist
																		//wenn der String enthalten ist, wird die Indexnummer übergeben, wenn nicht -1
		
		int size = stringArray.length;
		
		for (int i=0; i < size; i++){
			if (stringArray[i].equals(target)){
				return i;
			}	
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		//factorial(10);
		
		String [] sentence= {"hi", "how", "are", "you"};
		
		System.out.println("Index target: "+checkArray(sentence, "are"));
	}

}
