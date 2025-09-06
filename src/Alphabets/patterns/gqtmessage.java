package Alphabets.patterns;
import java.util.Scanner;
/**
 * @author Babji
 * @category patterns
 * @description This is an example for Alphabet Pattern
 */
public class gqtmessage {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//X
			for(int j=0;j<n;j++) {
				if(i==j || i+j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//C
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  ||i==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//L
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//L
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//N
			for(int j=0;j<n;j++) {
				if(i==j || j==0  ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
             //T
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) ) 
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

		