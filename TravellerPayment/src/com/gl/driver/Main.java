package com.gl.driver;

import java.util.Scanner;

import com.gl.service.Denominations;
import com.gl.sort.MergeSort;
public class Main {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no of currency");
		int currNo=sc.nextInt();
		System.out.println("enter the denominations");
		int deno[]=new int[currNo];
		for(int i=0;i<currNo;i++)
			deno[i]=sc.nextInt();
		System.out.println("Enter the amout you want to pay");
		int amt=sc.nextInt();
		MergeSort mergeSort = new MergeSort();
		Denominations denomination=new Denominations();
		mergeSort.sort(deno, 0, currNo - 1);
		denomination.notesCount( deno,currNo, amt);

	}

}
