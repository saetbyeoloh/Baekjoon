package Lv_3;

import java.util.Scanner;

public class Main_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int h=1;h<=i;h++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
