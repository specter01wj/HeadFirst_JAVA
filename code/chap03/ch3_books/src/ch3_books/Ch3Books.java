package ch3_books;

class Books {
	String title;
	String author;
}

public class Ch3Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books[] myBooks = new Books[3];
		int x = 0;

		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();

		myBooks[0].title = "FPGA";
		myBooks[1].title = "DSP";
		myBooks[2].title = "ARM";
		myBooks[0].author = "M1";
		myBooks[1].author = "M2";
		myBooks[2].author = "M3";

		while(x<3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x++;
		}

	}

}
