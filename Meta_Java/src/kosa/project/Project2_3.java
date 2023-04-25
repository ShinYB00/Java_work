package kosa.project;

public class Project2_3 {

	public static void main(String[] args) {
		int number = 5;
		
		for(int i = 1; i <= number; i++) {
			for(int j = 0; j < number - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
