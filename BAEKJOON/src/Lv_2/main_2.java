package Lv_2;

import java.util.Scanner;

public class main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		
		if (A>=90 && A<=100) {
			System.out.println("A");
		} else if (A>=80 && A<90){
			System.out.println("B");
		} else if (A>=70 && A<80) {
			System.out.println("C");
		} else if (A>=60 && A<70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
