package ch3_triangle;

public class Ch3Triangle {
	
	double area;
	int height, length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Ch3Triangle[] ta = new Ch3Triangle[4];
		
		while( x < 4 ) {
			ta[x] = new Ch3Triangle();
			ta[x].height = (x+1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			System.out.printf("triangle(" + x + "): area = " + ta[x].area + "\n");
			x++;
		}
		
		int y = x;
		x = 27;
		Ch3Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.printf("y = " + y + ", t5 area = " + t5.area + "\n");

	}
	
	void setArea() {
		area = (height * length) / 2;
	}

}
