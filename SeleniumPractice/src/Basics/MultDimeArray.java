package Basics;

import java.util.Scanner;

public class MultDimeArray {
	public static void main(String[] args) {
//		int[][] a=new int[2][2];
//		a[0][0]=1;
//		a[0][1]=2;
//		a[1][0]=3;
//		a[1][1]=4;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		int row=3;
		int column=4;
		int[][] a=new int[row][column];
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{

				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
