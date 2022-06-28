package Lv_3;

import java.util.Scanner;

public class Main_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			int j = sc.nextInt();
			if(j<x) {
				System.out.print(j+" ");
			} 
		}

	}

}
