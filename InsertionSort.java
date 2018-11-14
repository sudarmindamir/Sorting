import java.util.Arrays;


public class InsertionSort {
	public static void main(String[] args) {

		Double[] bilangan = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7 };
		System.out.println("DATA AWAL : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("PROSES INSERTION SORT :");
		System.out.println();
		
		for(int a = 0; a < bilangan.length; a++) {
			System.out.print("STEP-"+(a+1)+"--> ");
			Double key = bilangan[a];
			int c = a-1;
			while (c>=0 && bilangan[c] >key) {
				bilangan[c+1] = bilangan[c];
				c = c-1;
			}
			bilangan[c+1] = key;	
			System.out.println(Arrays.toString(bilangan));
			} 
			
		
		System.out.println();
		System.out.println("HASIL SORTING INSERTION : "+Arrays.toString(bilangan));
			
		}
}	   




