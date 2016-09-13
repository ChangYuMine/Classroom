package tw.org.iii.classroom0820;

public class 陣列測試 {

	public static void main(String[] args) {

		int[] d = new int[6]; // p[0] = 0, p[1] = 0;....p[5]=0;
		
		for (int e = 0; e < 100; e++) {
			
			int point2 = (int) (Math.random()*6);
			
			d[point2]++;}
			
		for (int f=3; f<d.length; f++){
			System.out.println((f+1) + ":" + d[f] );

		}
	}
}