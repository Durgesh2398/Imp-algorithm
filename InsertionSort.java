package Algorithms;

import java.util.Scanner;

public class InsertionSort {
//time complexity O(n^2)
	//space complexity O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		InsertionSort ob=new InsertionSort();
		ob.solution(arr,n);
	}
	void solution(int arr[],int n) {
		for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
