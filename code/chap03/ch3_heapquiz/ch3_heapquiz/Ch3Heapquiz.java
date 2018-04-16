package ch3_heapquiz;

public class Ch3Heapquiz {
	
	int id = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Ch3Heapquiz[] hq = new Ch3Heapquiz[5];
		
		while( x < 3) {
			hq[x] = new Ch3Heapquiz();
			hq[x].id = x;
			x++;
		}
		
		hq[3] = hq[1];
		hq[4] = hq[1];
		hq[3] = null;
		hq[4] = hq[0];
		hq[0] = hq[3];
		hq[3] = hq[2];
		hq[2] = hq[0];
		
		int y = 0;
		while(y < 5) {
			if( hq[y] != null ){
				System.out.printf("HQ(" + y + ") = " + hq[y].id + "\n");
			} else {
				System.out.printf("HQ(" + y + ") = " + hq[y] + "\n");
			}
			y++;
		}
		
	}

}
