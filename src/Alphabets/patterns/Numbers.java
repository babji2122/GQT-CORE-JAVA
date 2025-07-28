/**
 * 
 */
package  Alphabets.patterns;

import java.util.Scanner;

/**
 * 
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//0
			for(int j=0;j<n;j++)
			{
				if( j==0 || i==0 || i==n-1 ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//1
			for(int j=0;j<n;j++) {
				if(i+j==(n/2) || j==(n/2) || i==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//2
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)  || (j==(n-1)&&i<=n/2) || j==0&&i>=n/2 || i==n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//3
			for(int j=0;j<n;j++) {
				if(i==(n/2) || i==0 || j==(n-1) || i==(n-1) )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//4
			for(int j=0;j<n;j++) {
				if(i==(n/2) || i+j==(n/2) || j==(n/2) )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//5
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)  || (j==(n-1)&&i>=n/2) || j==0&&i<=n/2 || i==n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			System.out.print("    ");
			//6
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)  || (j==(n-1)&&i>=n/2) || j==0 || i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//7
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n-1) )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//8
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1  || j==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//9
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2 || j==(n-1) || (j==0&&i<=n/2) || i==(n-1))
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			sc.close();
		}

	}
}

