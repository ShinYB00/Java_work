package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExam {

	public static void main(String[] args) {
		int arr[] = {3, 2, 4};
		int brr[] = arr; // arr의 주소값을 받음
		
//		brr[0] = 10;
//		
//		System.out.println("brr : " + brr[0]);
//		System.out.println("arr : " + arr[0]);
		
		
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		// 내림차순
//		for(int i = 2; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		// 내림차순 교수님 답안 1
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[arr.length-1-i] + ",");
//		}
//		System.out.println();
//		
//		// 내림차순 교수님 답안 2
//		for(int i = arr.length-1; i >= 0; i--) {
//			System.out.print(arr[i] + ", ");
//		}
		
		
		// 2차원 배열
		int arr2[][] = {{2, 90}, {1, 60}, {3, 20}};
		
		Arrays.sort(arr2, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성 : 1차원 배열 안에 첫 번쨰 요소를 기준으로 오름차순
				if(o1[0] < o2[0]) {
					return -1; // 자리 이동 X
				} else if(o1[0] > o2[0]) {
					return 1; // 자리 이동 O
				} else {
					return 0;
				}
			}
			
		});
		
		System.out.println(Arrays.deepToString(arr2));
	}

}
