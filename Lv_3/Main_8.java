package Lv_3;

import java.util.Scanner;

public class Main_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] arr = new String[t];
		
		
		
		for(int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i-1]= "Case #"+i+": "+a+" + "+b+" = "+(a+b);
		} 
		
			for(int j=0; j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		
			//향상된 for문
			for(String result: arr) {
				System.out.println(result);
			}
	
	}

}
