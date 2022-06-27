package Lv_2;

import java.util.Scanner;

public class main_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int add = scan.nextInt();
		
		M += add;
		//M +=scan.nextInt();
		
		while(true) {
			if (M>=60) {
				M-=60;
				H+=1;
				}else {
				break;
			}
		}
	
		if(H>=24) {
			H-=24;
		}
		
		System.out.println(H+" "+M);

	}

}
