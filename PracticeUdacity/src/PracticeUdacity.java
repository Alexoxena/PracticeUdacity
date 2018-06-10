
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
	
	public static int deposit(double value){
		int i = 0;
		while (value < 1000000.0 ){
			value = value * 1.5;
			i++ ;
			}
		return i;
	}
	
	public static void inReverse (String [] stringArray){
		
		int size=stringArray.length;
		
		for (int i = size-1; i>=0; i--){
			
			System.out.println(stringArray[i]);
		}
	}
	public int inRange ( int [] intString){
		
		int size=intString.length;
		int min=intString[0];
		int max = intString[0];
		if (size==0){
			return -1;
		}
		
		for (int i=0; i<size; i++){
			
			if (intString[i]>max){
				max= intString[i];
			}
			if (intString[i]<min){
				min = intString[i];
			}
			
		}
			
		return max-min;
	}
		
	
	public static void main(String[] args) {
		
		//factorial(10);
		
		//String [] sentence= {"hi", "how", "are", "you"};
		
		//System.out.println("Index target: "+checkArray(sentence, "are"));
		
		//System.out.println(deposit (1000000.0));
		
		String [] stringArray = {"hi", "how", "are", "you"};
		
		inReverse(stringArray);
	}

}
