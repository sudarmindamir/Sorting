import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		Double nilai1[]; 
		Double nilai2[]; 
		Double nilaigab[];
		nilai1 = new Double[5];
		nilai2 = new Double[5];
		nilaigab= new Double[10];

		int i, j, k;
		Double temp;

		nilai1[0]=14.0;
		nilai1[1]=33.1;
		nilai1[2]=27.2;
		nilai1[3]=10.3;

		nilai2[0]=35.4;
		nilai2[1]=19.5;
		nilai2[2]=42.6;
		nilai2[3]=44.7;

		System.out.print("Nilai Pertama    : ");
		for ( i = 0 ; i <= 3 ; i++ )
		{
		System.out.print(" " +nilai1[i]);
		}
		System.out.println(" ");
		System.out.print("Nilai Kedua      : ");
		for ( i = 0 ; i <= 3 ; i++ )
		{
		System.out.print(" " +nilai2[i]);
		}

		for ( i = 0 ; i <= 2 ; i++ )
		{
		for ( j = i + 1 ; j <= 3 ; j++)
		{

		if( nilai1[i] > nilai1[j])
		{
		temp = nilai1[i];
		nilai1[i] = nilai1[j];
		nilai1[j] = temp;
		}

		if( nilai2[i] > nilai2[j])
		{
		temp = nilai2[i];
		nilai2[i] = nilai2[j];
		nilai2[j] = temp;
		}
		}
		}
		for(i=j=k=0; i<=8;)
		{
		if ( nilai1[j] <=  nilai2[k] )
		{
		nilaigab[i++] = nilai1[j++];
		}
		else
		{
		nilaigab[i++] = nilai2[k++];
		}
		if ( j==4 || k==4 )
		break;

		}
		for(;j <= 3;)
		{
		nilaigab[i++] = nilai1[j++];
		}
		for(;k <= 3;)
		{
		nilaigab[i++] = nilai2[k++];
		}
		
		System.out.println(" ");
		System.out.print("Hasil Pengurutan : " );
		for ( i = 0 ; i <= 7 ; i++ )
		{
		System.out.print(" " +nilaigab[i]);
		}
		}
	}






