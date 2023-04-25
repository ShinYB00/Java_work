package kosa.project2;

public class sp1_3 {

	public static void main(String[] args) {
		String s = "it is time to study";
		int index = 0;
		
		String arr[] = s.split(" ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > arr[i+1].length()) {
				index = i;
			} else {
				index = i+1;
			}
		}
		
		System.out.println(arr[index]);
	}

}
