package ch3_testarrays;

public class ch3_testarrays {

	public static void main(String[] args) {
		int[] index = new int[4];
		index[0] = 1; index[1] = 3; index[2] = 0; index[3] = 2;
		String[] islands = new String[4];
		islands[0] = "USA"; islands[1] = "UK"; islands[2] = "JP"; islands[3] = "China";

		int y = 0;
		int ref;

		while(y < 4) {
			ref = index[y];
			System.out.printf("island(" + ref + ") = " + islands[ref] + "\n");
			y++;
		}

	}

}
