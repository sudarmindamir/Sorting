

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		  int c, n, search, array[];
		  
		    Scanner in = new Scanner(System.in);
		    System.out.print("masukkan banyak element data :");
		    n = in.nextInt();
		    array = new int[n];
		 
		    System.out.println("Masukkan " + n + " angka : ");
		 
		    for (c = 0; c < n; c++)
		      array[c] = in.nextInt();
		 
		    System.out.print("Angka yang dicari : ");
		    search = in.nextInt();
		   
		    for (c = 0; c < n; c++)
		    {
		      if (array[c] == search)     
		      {
		         System.out.println(search + " angka yang dicari terdapat pada " + (c + 1) + ".");
		          break;
		      }
		   }
		   if (c == n)  
		      System.out.println(search + " tidak ditemukan dalam data.");
		  }
	}
