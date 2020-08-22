package Algorithms;

import java.util.Scanner;

public class BubbleSort {
//time complexity O(n^2)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		BubbleSort s=new BubbleSort();
		s.Solution(arr,n);
		System.out.println();
	}
	void Solution(int arr[],int n){
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}
