package com.qtech.imtership.daysix;

public class MultidimensionalArray {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of rows:");
	    int row = sc.nextInt();
	    System.out.println("Enter elements of array:");
	    int col = sc.nextInt();
	    int[][]arr=new int[row[[col];
	    System.out.println("Enter elements of array:");
	    for(int i=0; i < row; i++)
	    {
		    for(int j=0; j < col; j++) {
			arr[i][j]= sc.nextInt();
		    }
	    }
	    System.out.println("Elements of array are:');
	    for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
		   System.out.println(arr[i][j]+" ");
	    }
            sc.close();



	    }		    
