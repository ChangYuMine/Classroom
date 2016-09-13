package classroom0821;

public class Bike {
	
	private double speed;//屬性
	
	//建構式，無傳回值，類別名稱需相同，建立初始屬性。
	Bike(){
		speed=1;
		System.out.println("Bike()："+speed);
	}
	
	
	//方法
	void upSpeed(){
		speed*=speed>=10?1:speed*2;
		
	}
	double getspeed(){
		return speed;
	}
	
	
		
	}


