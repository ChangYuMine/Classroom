package tw.org.iii.classroom0820;

public class 陣列 {

	public static void main(String[] args){
		
		int []a=new int[100];//p[0]....p[5]=0
		
		for (int i=0; i<3; i++){  //迴圈數值在3以內
			
			int point = (int)(Math.random()*100);	// 0 - 5
			
			a[point]++;
		
			System.out.println(point);
			
		}

	}

}
