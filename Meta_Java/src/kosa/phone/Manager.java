package kosa.phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	
//	PhoneInfo arr[] = new PhoneInfo[10];
	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	Scanner sc = new Scanner(System.in);
	int count; // 지역 변수가 아닌 멤버 변수 필드이기 때문에 기본 값을 가지고 있어 초기화를 하지 않음
	
	// 객체를 만들기 위해 입력 받음
//	public void addPhoneInfo() {
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		System.out.print("전화번호 : ");
//		String phoneNo = sc.nextLine();
//		System.out.print("생년월일 : ");
//		String birth = sc.nextLine();
//		
//		arr[count++] = new PhoneInfo(name, phoneNo, birth);
//		
//	}
	
	public void addPhoneInfo() {
		System.out.println("1.일반 2.회사 3.동창 4.이전");
		System.out.print("선택 : ");
		String menu = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();

		switch (menu) {
		case "1":

//			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			list.add(new PhoneInfo(name, phoneNo, birth));
			break;

		case "2":

			System.out.print("부서 : ");
			String dept = sc.nextLine();
			System.out.print("직책 : ");
			String position = sc.nextLine();

			// PhoneInfo를 상속 받았기 때문에 배열을 넣을 수 있다.
//			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;

		case "3":

			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("학번 : ");
			String year = sc.nextLine();

//			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;

		case "4":
			System.out.println("이전으로 돌아갑니다.");
			return;
		}
		
	}
	
//	public void listPhoneInfo() {
//		for(int i = 0; i < count; i++) {
//			arr[i].show();
//		}
//		for(int i = 0; i < countC; i++) {
//			arrC[i].show();
//		}
//		for(int i = 0; i < countU; i++) {
//			arrU[i].show();
//		}
//		System.out.println("");
//	}
	
	public void listPhoneInfo() {
		
		System.out.println("1.전체 2.회사 3.동창 4.이전");
		System.out.print("선택 : ");
		String menu = sc.nextLine();

		switch(menu) {
		case "1":
//			for(int i = 0; i < count; i++) {
////				arr[i].show();
//			}
			Iterator<PhoneInfo> iter = list.iterator();
			while(iter.hasNext()) {
				iter.next().show();
			}
			break;

		// 여기 2, 3번 다시 확인하고 복습해보기
		case "2":
			for(int i = 0; i < count; i++) {
//				if(arr[i] instanceof Company) {
//					arr[i].show();
//				}
			}
			System.out.println("");
			break;

		case "3":
			for(int i = 0; i < count; i++) {
//				if(arr[i] instanceof Universe) {
//					arr[i].show();
//				}
			}
			System.out.println("");
			break;

		case "4":
			System.out.println("이전으로 돌아갑니다.");
			return;
		}

	}
	
	public void searchPhoneInfo() {
		System.out.print("이름 검색 : ");
		String str = sc.nextLine();
		int idx = -1; // 못 찾았을 경우 -1이란 인덱스 번호는 없기 때문에 사용	
		
//		 실제 들어간 데이터의 크기만큼만 돌려야 하기 때문에 count 사용
		for(int i = 0; i < count; i++) {
//			if(str.equals(arr[i].getName())) {
//				arr[i].show();
//				idx = i;
//				break;
//			}
		}
		
		if(idx == -1) {
			System.out.println("대상이 존재하지 않습니다.");
		} else {
//			System.out.println(Arrays.toString(arr));
		}
	}
	
	public void updatePhoneInfo() {
		System.out.print("수정하고 싶은 이름 : ");
		String str = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
//			if(str.equals(arr[i])) {
//				idx = i;
//				break;
//			}
		}
		
		if(idx == -1) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println("수정할 이름 : ");
//			arr[idx] = sc.nextLine();
		}
	}
	
	public void deletePhoneInfo() {
		
	}
	
}
