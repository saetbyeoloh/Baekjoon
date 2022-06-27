package Lv_2;

import java.util.Scanner;

public class main_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		M -= 45;
		if(M<0) {
			M+=60;
			H-=1;
		}
		if(H>=24) {
			H-=24;
		}
		if(H<0) {
			H+=24;
		}
		System.out.println(H+" "+M);

	}

}
