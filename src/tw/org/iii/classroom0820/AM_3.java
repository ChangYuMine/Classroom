package tw.org.iii.classroom0820;

public class AM_3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){//判斷是否為質數
			System.out.println(i+"");
			if(i%10==0){
				System.out.println();
			}
		}
		
		for(int j=0;j<10;j++){
			for(int i=1;i<=10;i++){
				int v=j*10+1;
				//判斷是否為質數
				boolean isok=true;
				for(int k=2;k<v;k++){
					if(v%k==0){
						//非質數
						isok = false;
						break;
					}
				}
			}
		}
		
		
	}
}
