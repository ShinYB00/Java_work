package kosa.project;

public class Project1_1 {

	public static void main(String[] args) {
		int number = 5;
		int num = 26;
		
		for(int i = 1; i < num; i++) {
			
			if(i % number != 0) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
			
		}

	}

}
