package day03;

import java.util.Scanner;

public class IfEx02 {
	
	public static void main(String[] args) {
		
		//점수를 입력받아서 점수에 따라 학점을 부여

		Scanner scan = new Scanner(System.in);
		
		//하나씩 걸러낸다는 생각으로 조건을 고려하면서 쓰기
		
		System.out.print("점수입력>");
		int point = scan.nextInt();
		
		if(point >= 90) {
			//System.out.println("A학점");
			//90이상일 때 또 다른 조건을 검사하고 싶어짐
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			
			System.out.println("축하합니다!");
			
		} else if(point >=80) {
			System.out.println("B학점");
		} else if(point >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("재수강");
		}
		
	}

}
