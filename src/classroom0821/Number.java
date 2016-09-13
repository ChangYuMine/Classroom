package classroom0821;

import javax.swing.JOptionPane;

public class Number {

	public static void main(String[] args) {
	//產生謎底
		
		String answer=createanswer();
		
		//猜題
	
		for(int i=0;i<10;i++){
			
		String guess= JOptionPane.showInputDialog("猜題");
		
		if(guess.equals(answer))
			
		{JOptionPane.showInputDialog(null,"對了");
		break;}
		
		else
			
		{String result = checkAB(answer, guess);	
		JOptionPane.showInputDialog(null,"錯了");}
		
		}
	}
	static String checkAB(String a , String g)
	
	{return "1A2B";}
	
	static String createanswer()
	
	{return"789";}

}
