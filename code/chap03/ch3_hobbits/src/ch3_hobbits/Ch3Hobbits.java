package ch3_hobbits;

public class Ch3Hobbits {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch3Hobbits[] h = new Ch3Hobbits[3];
		int z = 0;
		
		while(z<3) {
			h[z] = new Ch3Hobbits();
			h[z].name = "bilbo";
			if(z==1) {
				h[z].name = "frodo";
			}
			if(z==2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			z++;
		}
		
	}

}
