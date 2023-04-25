package kosa.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Mission03 {
	static int count = 0; // 메소드 단위로 하고 싶을 때
	static Scanner sc = new Scanner(System.in);
	
	public static void add(String arr[]) {
		System.out.print("이름 : ");
		arr[count++] = sc.nextLine();
		
	}
	
	public static void print(String arr[]) {
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
	}
	
	public static void search(String arr[]) {
		System.out.print("검색 이름 : ");
		String str = sc.nextLine();
		int idx = -1; // 못 찾았을 경우 -1이란 인덱스 번호는 없기 때문에 사용
		
		for(int i = 0; i < count; i++) {
			if(str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println((idx+1) + "번째 있습니다.");
		}
	}
	
	public static void update(String arr[]) {
		System.out.print("수정 이름 : ");
		String str = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			if(str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println("수정할 이름 : ");
			arr[idx] = sc.nextLine();
		}
	}
	
	public static void delete(String arr[]) {
		System.out.print("삭제 이름 : ");
		String str = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			if(str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			for(int i = idx; i < count-1; i++) {
				arr[i] = arr[i+1];
			}
			count--;
		}
	}

	public static void main(String[] args) {
		// 배열에 문자열을 추가, 출력, 검색, 수정, 삭제
//		String arr[] = {"aa", "bb", "cc"};
//		Scanner sc = new Scanner(System.in);
		String arr[] = new String[10];
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				add(arr);
				break;
			case "2":
				print(arr);
				break;
			case "3":
				search(arr);
				break;
			case "4":
				update(arr);
				break;
			case "5":
				delete(arr);
				break;
			case "6":
				System.out.println("프로그램이 종료 되었습니다.");
				return;
			}
		}
		
//		while(true) {
//			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
//			System.out.print("메뉴 입력 : ");
//			String menu = sc.nextLine();
//			
//			switch(menu) {
//			case "1":
//				System.out.print("추가할 문자 입력 : ");
//				String s1 = sc.nextLine();
//				
//				break;
//			case "2":
//				System.out.println(Arrays.toString(arr));
//				break;
//			case "3":
//				System.out.print("검색할 문자 입력 : ");
//				String s3 = sc.nextLine();
//				for(int i = 0; i < arr.length; i++) {
//					if(arr[i].equals(s3)) {
//						System.out.println(i);
//					}
//				}
//				break;
//			case "4":
//				System.out.print("수정할 문자 입력 : ");
//				String s4 = sc.nextLine();
//				System.out.print("새로운 문자 입력 : ");
//				String ss = sc.nextLine();
//				for(int i = 0; i < arr.length; i++) {
//					if(arr[i].equals(s4)) {
//						arr[i]= ss;
//						System.out.println(Arrays.toString(arr));
//					}
//				}
//				break;
//			case "5":
//				System.out.print("삭제할 문자 입력 : ");
//				String s5 = sc.nextLine();
//				for(int i = 0; i < arr.length; i++) {
//					if(arr[i].equals(s5)) {
//						arr[i]= null;
//						System.out.println(Arrays.toString(arr));
//					}
//				}
//				break;
//			case "6":
//				System.out.println("프로그램이 종료 되었습니다.");
//				break;
//			}
//		}

	}

}
