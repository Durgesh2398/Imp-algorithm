package Algorithms;

import java.util.Scanner;

public class SelectionSort {
//time compexity is O(n^2)
	//space complexity is O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SelectionSort ob=new SelectionSort();
		ob.Solution(arr,n);
	}
	void Solution(int arr[],int n) {
		for (int i = 0; i < n-1; i++) { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) { 
                if (arr[j] < arr[min_idx]) { 
                    min_idx = j; 
                }
            }
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
		for (int i=0; i<n; ++i) {
            System.out.print(arr[i]+" ");
		}
	}
}
