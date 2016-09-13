package classroom0821;
import java.util.*;
public class 撲克牌 {

	public static void main(String[] args) {
	
	//洗牌
		
	int[]a=new int[52];//0...0
	
	for (int z=0;z<a.length;z++){
		
	int c=(int)(Math.random()*52);
	
	boolean isOK=true;//檢查機制開始
	
	for(int j=0;j<z;j++){
		if(a[j]==c){
			isOK=false;
			break;
		}
	}
	if(!isOK){
		z--;
		continue;//檢查機制結束
		
		
	}
	a[z]=c;
	
	System.out.println(a[z]);
	}

		
	//牌to四位玩家
	
	int[][]player=new int[4][13];
	
	for(int i=0;i<a.length;i++){
		
		player[i%4][i/4]=a[i];
		for(int p:player[1]){
			System.out.println(p);
		}
	}
		
	//理牌=>攤牌
	String[] suit = {"黑桃","紅心","方塊","梅花"};
	
	String[] suit2 ={"A","2","3","4","5","6","7","8","9","10"
			
	,"11","12","13"};
	
	for(int cards[]:player){
		
		Arrays.sort(cards);
		
		for(int card:cards){
			
			System.out.print(suit[card/13]+card+"   ");
		}
		
		System.out.println();	
	}
	
	
	
	
	}

}
