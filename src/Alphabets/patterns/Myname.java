package Alphabets.patterns;
import java.util.Scanner;
/**
 * @author Lenovo
 * @category patterns
 * @description This is an example for Alphabet Pattern
 */
public class Myname {
	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
				//B
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n/2) || i==(n-1) ||j==(n-1) ) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("    ");
				//A
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n/2) || j==(n-1)  ) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("    ");
				//B
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 || i==(n/2) || i==(n-1) ||j==(n-1) ) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("    ");
						//J
						for(int j=0;j<n;j++) {
							if(i==0 || j==(n/2) || i==(n-1)&&j<=n/2 || j==0&&i>=n/2) 
							{
								System.out.print("* ");
							}
							else {
								System.out.print("  ");
							}
						}
						System.out.print("    ");
								//I
								for(int j=0;j<n;j++) {
									if(i==0 || j==(n/2) || i==(n-1) ) 
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

					
				