import java.util.Arrays;

public class BubbleShort {
	public static void main(String[] args) {
	Double[] bilangan = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7};
	
	System.out.println("DATA AWAL : "+Arrays.toString(bilangan));
	System.out.println();
	System.out.println("PROSES BUBBLE SORT :");
	System.out.println();
	
	for(int a = 0; a < bilangan.length; a++) {
		
		for(int b = 0; b < bilangan.length-1; b++) {
			if(bilangan[b] > bilangan[b+1]) {
				Double temp = bilangan[b];
				bilangan[b] = bilangan[b+1];
				bilangan[b+1] = temp;
			}
			System.out.println("STEP->"+(a+1)+", MIN = "+bilangan[b+1]+" SWAP("+(a+1)+","+bilangan[b+1]+")"+" -> "+Arrays.toString(bilangan));
		}
		
		System.out.println();
	}
	System.out.println("HASIL SORTING BUBBLE : "+Arrays.toString(bilangan));
	}
}