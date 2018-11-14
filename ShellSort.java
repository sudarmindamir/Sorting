import java.util.Arrays;

public class ShellSort {

	
	  public static void main(String a[])  
	    {  
	        //data  
	        double n[] = {14.0 , 33.1 , 27.2 , 10.3 , 35.4 , 19.5 , 42.6 , 44.7};  
	        //DSebelum di urutkan
	        System.out.println("Data "+Arrays.toString(n));  
	        for(int i = 0; i < n.length; i++)  
	          {  
	            System.out.println("STEP-"+i+"--> "+Arrays.toString(n)); 
	          }  
	        
	        //Sorting in ascending order using Shell Sort  
	        initializemergeSort(n);;  
	        //Metode Pengurutan
	        System.out.print("Hasil Pengurutan : ");  
	        for(int i = 0; i < n.length; i++)  
	          {  
	            System.out.print(n[i]+" ");  
	          }  
	    }  
	    public static void initializemergeSort(double[] n)   
	    {  
	        int i1,i,j,increment,temp, no_of_elem=n.length;  
	        /* Shell Sort Program */  
	        for (increment=no_of_elem/2;increment>0;increment/=2)  
	        {  
	            for(i=increment;i<no_of_elem;i++)  
	            {  
	                temp=(int) n[i];  
	                for(j=i;j>=increment;j-=increment)   
	                {  
	                    if(temp<n[j-increment])  
	                    {  
	                        n[j]=n[j-increment];  
	                    }  
	                    else   
	                    {  
	                        break;  
	                    }  
	                }  
	                n[j] = temp;  
	            }  
	        }  
	    }
}

