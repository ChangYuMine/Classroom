package tw.org.iii.classroom0820;

public class 陣列測試_3 {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		int[] d = new int[6];
		
		for (int b = 0; b < a.length; b++) {
			
		int point = (int) (Math.random()*3);
			
		a[point]++;}
		
		for (int e = 0; e < d.length ; e++) {
			
		int point2 = (int) (Math.random()*6);
			
		d[point2]++;}
		
		for (int c=0; c<a.length; c++){
		System.out.println((c+1) + ":" + a[c] );}
		
		for (int f=3; f<d.length; f++){
		System.out.println((f+1) + ":" + d[f] );}
	}

}
