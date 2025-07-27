package com.gqt.corejava.packages;
import java.util.Scanner;
public class pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size:");
	     int n = sc.nextInt();
	     char start='A';
			for (int i=0; i<n; i++)
			{
				for(int j=0; j<(n-i-1)*2;j++)
				{
					System.out.print(" ");
				}
				char ch=(char) (start+i*2);{
					for(int j=0;j<=i*2;j++)
					{
						System.out.print(ch+" ");
						ch--;
					}
					System.out.println();
				}
			}
	}
}
