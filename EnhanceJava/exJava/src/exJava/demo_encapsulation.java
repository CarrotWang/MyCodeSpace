package exJava;
//学习封装相关知识
//http://www.cnblogs.com/vamei/archive/2013/03/27/2982209.html

public class demo_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Torch torch = new Torch(100);
		torch.charge();
		torch.switcher();
		torch.switcher();
	}

}

class Torch{
	private int power;
	private boolean s= true;
	public Torch(int mpower){
		power = mpower;
	}
	public void switcher(){
		if(s){
			System.out.println("swithc is going off...");
			s = false;
		}else{
			System.out.println("swithc is going on...");
			s = true;
		}
	}
	
	public void charge(){
		System.out.println("the torch is charging");
	}
	
}