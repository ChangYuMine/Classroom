package tw.org.iii.classroom0820;

public class 陣列測試_2 {

	public static void main(String[] args) {

		int[] a = new int[3]; // p[0] = 0, p[1] = 0;....p[5]=0;
		
		for (int b = 0; b < 100; b++) {
			
			int point = (int) (Math.random()*3);
			
			a[point]++;}
			
		for (int c=0; c<a.length; c++){
			System.out.println((c+1) + ":" + a[c] );

		}
	}
}
