package classroom0821;

public class 撲克牌_2 {

	public static void main(String[] args){
		//洗牌
		
		int[]a=new int[52];//0...0
		
		boolean isOK;
		
		
		
		for (int z=0;z<a.length;z++){
		do{	
		int c=(int)(Math.random()*52);
			
			isOK=true;//檢查機制開始
			
			for(int j=0;j<z;j++){
				if(a[j]==c){
					isOK=false;
						
		
		
			
		
		if(!isOK){
			z--;
			//檢查機制結束
			
			
		
		a[z]=c;
		
		System.out.println(a[z]);
		}
				}
			}
		}while(isOK);
		}
	}
}
		
			
		//牌to四位玩家
			
		//理牌=>攤牌



		
	

		
		

