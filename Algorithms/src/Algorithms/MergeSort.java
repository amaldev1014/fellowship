package Algorithms;

import java.util.Scanner;

public class MergeSort {

	 static void merge(int arr[], int l, int m, int r) 
	    { 
	      
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	       
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	      
	  
	     
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	       
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	  
	  
	    static void sort(int arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	           
	            int m = (l+r)/2; 
	  
	             
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            
	            merge(arr, l, m, r); 
	        } 
	    } 
	  
	  
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	System.out.println("Array size: ");
	     Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt(); 
	        
	        int array[] = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for(int i=0;i<n;i++) 
	        {
	        	array[i] =  scan.nextInt();
	        }
	        printArray(array); 
	  
	        
	        sort(array, 0, array.length-1); 
	  
	        System.out.println("\nSorted array"); 
	        printArray(array); 
	    } 
	} 
	


