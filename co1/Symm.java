package oop;
import java.util.Scanner;
public class Symm {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int col,row,i,j;
		System.out.println("Enter the no: of rows");
		row=sc.nextInt();
		System.out.println("Enter the no: of columns");
		col=sc.nextInt();
		int mat[][]=new int [row][col];
		int transpose[][]=new int[row][col];
		System.out.println("Enter the elements of  matrix:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				transpose[j][i]=mat[i][j];
			}
		}
		
		
		System.out.println("The elements of matrix:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
		System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		int flag=1;
			for(i=0;i<row;i++){
				for(j=0;j<col;j++){
			if(mat[i][j]!=transpose[i][j]){
				flag=0;
			}
				}
			}
			if(flag==0)	
				System.out.println("The matrix is not symmetric");
				
				else
				
				System.out.println("The matrix is  symmetric");
				
			}}
