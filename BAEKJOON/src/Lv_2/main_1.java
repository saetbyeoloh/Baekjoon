package Lv_2;

import java.util.Scanner;

public class main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			
			if (A>B){
				System.out.println(">");
			}else if (B>A) {
				System.out.println("<");
			}else {
				System.out.println("==");
				
			}
			
			

		}

	}


