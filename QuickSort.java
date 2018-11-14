
public class QuickSort {

	
		static void quickSort (int a[], int indexMIN, int indexMAX){
		
		        int i=indexMIN, j=indexMAX, h;
		        int pivot=a[indexMIN];

		    
		        do{
		            while (a[i]<pivot) i++;
		            while (a[j]>pivot) j--;
		            if (i<=j)
		            {
		                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
		                i++; j--;
		            }
		        } while (i<=j);

		    //  pengurutan
		        if (indexMIN<j) quickSort(a, indexMIN, j);
		        if (i<indexMAX) quickSort(a, i,indexMAX);
		    }

		    
		    public static void main(String[] args) {
		        int tabInt[]={24,17,18,15,22,26, 13, 21, 16, 28};
		        int i,n=10;
		        
		            for(i=0;i<n;i++){
		                System.out.print(tabInt[i]+ " ");
		           }
		            System.out.print("\n");
		        quickSort(tabInt,0,n-1);
		        
		        for(i=0;i<n;i++){
		            System.out.print(tabInt[i]+" ");
		        }

		    }

		}


